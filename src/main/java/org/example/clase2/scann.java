package org.example.clase2;

import java.util.Scanner;

public class scann {
    public static void main(String[] args) {
        Scanner miscanner = new Scanner(System.in);

        System.out.println("ingrese una cadena");
        String cadena = miscanner.nextLine(); //next no puede tener espacios, nextLine si

        System.out.println("Ingrese un precio");
        double precio = miscanner.nextDouble();

        System.out.println("Ingrese un entero");
        int entero = miscanner.nextInt();

        System.out.println("Cadena ingresada: " + cadena);
        System.out.println("Precio ingresado: " + precio);
        System.out.println("Entero ingresado: " + entero);

        miscanner.close();


    }
}
