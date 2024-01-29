package org.example.Clase5.practicasDeClase.Figuras;

import java.util.ArrayList;
import java.util.List;

public class mainAbstract {

    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado("rojo", 10);

        Rectangulo rectangulo = new Rectangulo("verde", 5, 8);

        Triangulo triangulo = new Triangulo ("amarillo", 7, 15);

        List<Figura> listaDeFiguras = new ArrayList<>();

        listaDeFiguras.add(cuadrado);
        listaDeFiguras.add(triangulo);
        listaDeFiguras.add(rectangulo);

        //Los dos metodos que siguen son lo mismo: for each
        
        //listaDeFiguras.forEach(Figura -> System.out.println("Area: "+ Figura.calcularArea()));

        for (Figura figura : listaDeFiguras) {
            System.out.println("Area: "+ figura.calcularArea());
        }
    }

}
