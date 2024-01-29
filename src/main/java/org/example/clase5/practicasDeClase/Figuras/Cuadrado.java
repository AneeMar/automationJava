package org.example.Clase5.practicasDeClase.Figuras;

import org.example.Clase5.practicasDeClase.Figuras.Figura;

public class Cuadrado extends Figura {

    private Integer lado;
    public Cuadrado(String color, Integer lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public Integer calcularArea() {
        return lado*lado;
    }
}
