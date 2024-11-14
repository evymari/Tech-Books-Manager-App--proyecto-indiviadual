package com.example.bookManager;


public class Main {

    public static void main(String[] args) {
        Application app = new Application();
        app.printMenu();
       // BookConsoleView app = new BookConsoleView();
       // app.printMenu();
    }

         //Menu menu = new Menu();
         //menu.imprimir();

        //CASO USO : guardar libro

       // MySQLBookRepository  bookRepository = new MySQLBookRepository ();
        //añadir un libro
       // Book book = new Book( "C235", "clean ", "uncle");
       // bookRepository.save(book);

        /*List<Book> list = bookRepository.findAll();
        for (Book book: list){
            //System.out.println(book);
        }

        Optional<Book> optionalBook = bookRepository.findByIsbn("C234");

        if (optionalBook.isPresent()) {
            Book book = optionalBook.get();
            System.out.println(book);
        }
        if (optionalBook.isEmpty()){
            System.out.println("El libro no se encuentra");}

    }/*

  /* bookRepository.deleteByIsbn("C234");
        List<Book> List = bookRepository.finALL();
        for (Book book:List) {
            System.out.println(book);
        }*/


        /*Optional<Book>optionalBook = bookRepository.findByIsbn("C234");

       if(  optionalBook.isPresent()){

            Book book = optionalBook.get();
            System.out.println();
        }
        if(optionalBook.isEmpty()){

            System.out.println("EL LIBRO NO EXISTE");
        }*/
}


