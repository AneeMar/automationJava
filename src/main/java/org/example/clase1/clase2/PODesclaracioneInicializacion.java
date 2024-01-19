package org.example.clase1.clase2;

public class PODesclaracioneInicializacion {
    public static void main(String[] args) {
        int count; //declaracion de la variable

        count=100; //iniciacion de la variable

        System.out.println("Variable "+ count);

        //declaración e inicialización.

        float precio = 140.59f; //hay que castearlo porque en defecto es un double
        float precio2 = (float) 156.30; //otra forma de castearlo

        System.out.println( "primer precio " + precio + "segundo precio " + precio2);
    }
}
