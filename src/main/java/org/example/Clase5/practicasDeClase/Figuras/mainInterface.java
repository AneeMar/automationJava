package org.example.Clase5.practicasDeClase.Figuras;

import java.util.ArrayList;
import java.util.List;

public class mainInterface {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado("rojo", 10);

        Rectangulo rectangulo = new Rectangulo("verde", 5, 8);

        Triangulo triangulo = new Triangulo ("amarillo", 7, 15);

        List<Dibujable> listaDeDibujables = new ArrayList<>();

        listaDeDibujables.add(cuadrado);
        listaDeDibujables.add(triangulo);
        //listaDeDibujables.add(rectangulo); <- el rectangulo no es dibujable

        for(Dibujable dibujable : listaDeDibujables){
            dibujable.dibujar();
            dibujable.borrar();
        }
    }

}
