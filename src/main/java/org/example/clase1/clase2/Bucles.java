package org.example.clase1.clase2;

public class Bucles {
    public static void main(String[] args) {
       //While

        int contador = 0;

        while (contador < 5) {
            System.out.println("hola mundo");
            contador++;
        }

        System.out.println();

        //Do While
         int contador2 = 0;
        do {
            System.out.println("hola mundo DoWhile");
            contador2++;
        } while (contador2 < 5);

        System.out.println();

        //for

        for (int contador3 = 0;contador3 < 5;contador3++) {
            System.out.println("hola mundo For");
        }
    }
}
