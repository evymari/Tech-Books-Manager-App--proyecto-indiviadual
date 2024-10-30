package com.alexmonzon;
import java.util.Scanner;

public class Imprimir {

    private Libro[] listaLibros = { new Libro("A123", "Effective Java", "Joshua Bloch"),
            new Libro("A234", "Effective Javascript", "Joshua Bloch"),
            new Libro("A345", "Effective C", "Joshua Bloch")};


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
                    break;
                case 2:
                    System.out.println("Option 2: Ver todos los libros");
                    imprimirlibros(listaLibros);
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

    private void imprimirlibros(Libro[] listaLibros) {
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);
        }
    }


}

