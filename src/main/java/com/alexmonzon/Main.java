package com.alexmonzon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("1. Añadir Libro");
        System.out.println("2. Ver todos los libros");
        System.out.println("3. Eliminar libro");
        System.out.println("4. Cambiar Repositorio");
        System.out.println("5. Salir");

        System.out.println("Select the option: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Option 1: Añadir Libro");
                break;
            case 2:
                System.out.println("Option 2: Ver todos los libros");
                break;
            case 3:
                System.out.println("Option 3: Eliminar libro");
                break;
            case 4:
                System.out.println("Option 4: Cambiar Repositorio");
                break;
            case 5:
                System.out.println("Option 5: Salir");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }


    }
}

