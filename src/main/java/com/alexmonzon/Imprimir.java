package com.alexmonzon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imprimir {
    private List<Libro> lista = new ArrayList<>();
    Libro libro1 = new Libro("A123", "Java", "java");


    public void imprimir() {

        int option;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("1. Añadir Libro");
            System.out.println("2. Ver todos los libros");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Cambiar Repositorio");
            System.out.println("5. Salir");

            System.out.println("Select the option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Option 1: Añadir Libro");
                    addBook();
                    System.out.println("Se ha añadido un libro con éxito");
                    break;
                case 2:
                    System.out.println("Option 2: Ver todos los libros");
                    imprimirlibros(lista);
                    break;
                case 3:
                    System.out.println("Option 3: Eliminar libro");
                    break;
                case 4:
                    System.out.println("Option 4: Cambiar Repositorio");
                    break;
                case 5:
                    System.out.println("Option 5: Salir");
                    option = 5;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 5);
    }

    private void addBook() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" Introdusca el isbn. (El campo no puede estar vacio)");
            String isbn = sc.next();
            if (!isbn.matches("^[A-Za-z]\\d{3}$") || isbn.trim().isEmpty()) {
                System.out.println("Ingrese una letra seguida de tres números");
                continue;
            }
            ;

            System.out.println("introduce titulo. (El campo no puede estar vacío)");
            String titulo = sc.next();
            if (titulo.trim().isEmpty()) {
                continue;
            }
            System.out.println("Introduce autor. (El campo no puede estar vacío.)");
            String autor = sc.next();
            if (autor.trim().isEmpty()) {
                continue;
            }

            Libro libro = new Libro(isbn, titulo, autor);
            lista.add(libro);
            imprimirlibros(lista);
            if ( lista.add(libro)== true){
                System.out.println("El libro se ha añadido correctamente.");
                System.out.println("¿Quiere añadir otro libro? S/N");
                String value = sc.next();
                if (value == "s" || value == "S"){
                    continue;
                }else {

                    break;
                }

            }
        }
        System.out.println("Gracias");
    }

    private void imprimirlibros(List<Libro> listaLibros) {

        if (listaLibros.size() == 0) {
            System.out.println("La lista de libros está vacía.");
            return;
        }

        for (Libro listaLibro : listaLibros) {
            System.out.println(lista);


        }

    }


}

