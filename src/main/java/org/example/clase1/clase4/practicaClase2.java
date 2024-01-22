package org.example.clase1.clase4;

/*Ingresar por consola un número mientras sea menor o igual a 500
y almacenar el número en una lista. Al finalizar el ingreso mostrar
los datos y la cantidad ingresada por pantalla.
También, sí hubo menos de 10 ingresos mostrar “Se ingresaron
pocos números” de los contrario mostrar “Se excedió la cantidad
de ingresos”*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practicaClase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numeros; //equivale int

        List<Integer> ListadeNumeros = new ArrayList<>();

        // primero hacemos el do-while, que siempre tiene que estar activo
            do {
                System.out.println("ingrese un numero");
                numeros = scanner.nextInt();

                ListadeNumeros.add(numeros);
            } while (numeros <= 500);

        //esto va siempre en pantalla
        System.out.println("Datos ingresados: " + ListadeNumeros);
        System.out.println("La cantidad de datos ingresados fue: " + ListadeNumeros.size());

        //ahora vemos la condición de los textos, qué te tiene que arrojar

        if(ListadeNumeros.size()<10) {
            System.out.println("Se ingresaron pocos numeros");
        } else {
            System.out.println("Se excedió la cantidad de ingresos");
        }
    }
}
