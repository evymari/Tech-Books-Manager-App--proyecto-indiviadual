package com.alexmonzon;




import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        MySQLBookRepository bookRepository = new MySQLBookRepository();
       // Menu menu = new Menu();
       // menu.imprimir();

        //CASO USO : guardar libro


        //añadir un libro
        Book newBook = new Book( "C233", "clean ", "uncle");
        bookRepository.save(newBook);

        List<Book> list = bookRepository.findALL();
        for (Book book : list) {
            System.out.println(book);
        }


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


}


