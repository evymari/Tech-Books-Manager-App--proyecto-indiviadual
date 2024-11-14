package com.example.bookManager;

import java.util.Scanner;


public class Application {

    private final BookManager bookManager = new BookManager();
    private Scanner scanner = new Scanner(System.in);

    public Application() {
        this.bookManager.bookList.add(new Book("A123", "Clean", "Robert C Martin"));
    }

    public void printMenu() {

        Scanner scanner = new Scanner(System.in);
        String[] menu = {
                "1. Añadir libro",
                "2. Ver todos los libros",
                "3. Eliminar libro",
                "4. Cambiar respositorio",
                "5. Salir"
        };
        byte option = 0;
        while (option != 5) {
            for (String menuItem : menu) {
                System.out.println(menuItem);
            }
            System.out.println("Seleccione una opción:");

            String input = scanner.nextLine();
            try {
                option = Byte.parseByte(input);

            } catch (Exception ex) {
                System.out.println("Esto no es un numero");
                continue;

            }
            if (option < 1 || option > 5) {
                System.out.println("El numero fuera de rango");
                continue;
            }
            System.out.println("He elegido: " + menu[option - 1]);
            this.optionSelector(option);

            System.out.println("____________________________________");

        }
    }

    private void optionSelector(byte option) {
        if (option == 1) this.printAddBookMenu();
        if (option == 2) this.printBookList();
        if (option == 3) this.printRemoverBookMenu();

    }

    private void printRemoverBookMenu() {
        System.out.println("ISBN del libro a borrar: ");
        String isbnToDelete = scanner.nextLine();
        this.deleteByIsbn(isbnToDelete );
        System.out.println("Se ha eliminado el libro" + isbnToDelete);
    }

    private void deleteByIsbn(String isbnToDelete) {
        bookManager.bookList.removeIf(book -> book.getIsbn().equals(isbnToDelete));
    }

    private void printAddBookMenu() {
        System.out.println(" Introdusca el isbn. (El campo no puede estar vacio)");
        String isbn = scanner.nextLine();

        System.out.println("introduce titulo. (El campo no puede estar vacío)");
        String title = scanner.nextLine();

        System.out.println("Introduce autor. (El campo no puede estar vacío.)");
        String author = scanner.nextLine();
        try {
            this.createBook(isbn, title, author);
            System.out.println("El libro se ha creado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void createBook(String isbn, String title, String author) {
        //Book newBook = new Book(isbn, title, author);
        // bookList.add(newBook);

        if (bookManager.bookList.stream().anyMatch(book -> book.getIsbn().equals(isbn))) {
            throw new IllegalArgumentException("Este book ya existe");
        }
        Book newBook = new Book(isbn, title, author);
        bookManager.bookList.add(newBook);
    }


    private void printBookList() {
        if (bookManager.bookList.isEmpty()) System.out.println("No hay libros");
        for (Book book : bookManager.bookList) {
            System.out.println(book.toString());
        }
    }
}
/*public class Application { private final BookManager bookManager = new BookManager();
    private Scanner sc;
    Libro libro1;

    public Application() {
        this.sc = new Scanner(System.in);
        this.libro1 = new Libro("A123", "Java", "java");
    }

    public void imprimir() {
        Scanner sc = new Scanner(System.in);
        String[] menu = new String[]{"1. Añadir Libro", "2. Ver todos los libros", "3. Eliminar libro", "4. Cambiar Repositorio", "5. Salir"};

        int option;
        do {
            String[] var4 = menu;
            int var5 = menu.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                String item = var4[var6];
                System.out.println(item);
            }

            System.out.println("Select the option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Option 1: Añadir Libro");
                    this.optionSelector(option);
                    break;
                case 2:
                    System.out.println("Option 2: Ver todos los libros");
                    this.optionSelector(option);
                    break;
                case 3:
                    System.out.println("Option 3: Eliminar libro");
                    this.optionSelector(option);
                    break;
                case 4:
                    System.out.println("Option 4: Cambiar Repositorio");
                    break;
                case 5:
                    System.out.println("Option 5: Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while(option != 5);

    }

    private void optionSelector(int option) {
        if (option == 1) {
            this.printAddBookMenu();
        }

        if (option == 2) {
            this.printBookList();
        }

        if (option == 3) {
            this.printDeleteBook();
        }

    }

    private void printAddBookMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introdusca el isbn. (El campo no puede estar vacio)");
        String isbn = sc.nextLine();
        System.out.println("introduce titulo. (El campo no puede estar vacío)");
        String titulo = sc.nextLine();
        System.out.println("Introduce autor. (El campo no puede estar vacío.)");
        String autor = sc.nextLine();

        try {
            this.bookManager.createBook(isbn, titulo, autor, this);
            System.out.println("El libro añadido con éxito");
        } catch (Exception var6) {
            Exception e = var6;
            System.out.println(e.getMessage());
        }

    }

    private void printDeleteBook() {
        System.out.print("Introduce el ISBN del libro a eliminar: ");
        String isbn = this.sc.nextLine();

        try {
            this.bookManager.deleteBook(isbn);
            System.out.println("El libro con ISBN " + isbn + " ha sido eliminado.");
        } catch (Exception var3) {
            Exception e = var3;
            System.out.println(e.getMessage());
        }

    }

    private void printBookList() {
        try {
            this.bookManager.emptyBookList(this.bookManager.bookList);
            System.out.println("Lista de libros: ");
            System.out.println(this.bookManager.bookList);
        } catch (Exception var2) {
            Exception e = var2;
            System.out.println(e.getMessage());
        }

    }
}
*/

