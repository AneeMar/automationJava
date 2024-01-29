package org.example.Clase5.practicasDeClase.Figuras;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract Integer calcularArea();
}
