package org.example.clase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3Colecciones {
    public static void main(String[] args) {

        //Arrays
        int[] ArrayEnteros = new int[3];

        ArrayEnteros[0] = 100;
        ArrayEnteros[1] = 200;
        ArrayEnteros[2] = 300;

        System.out.println("El numero seleccionado es: " + ArrayEnteros[2]);

        System.out.println("El contenido del array es: " + Arrays.toString(ArrayEnteros));

        //puedo cambiar el valor de una posición en cualquier momento, pero no agregar posiciones

        ArrayEnteros[2] = 500;
        System.out.println("El contenido del array es: " + Arrays.toString(ArrayEnteros));

        //Listas

        List<String> listaString = new ArrayList<>();
        listaString.add("hola");
        listaString.add("Chau");
        listaString.add("konnichiwa");

        System.out.println("Esta lista contiene: "+ listaString);

        System.out.println("La posición 0 de la lista contiene: "+ listaString.get(0));

        listaString.remove(2);
        System.out.println("Esta lista ahora contiene: "+ listaString);
    }
}
