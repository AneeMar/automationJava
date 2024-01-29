package org.example.Clase5.practicasDeClase.Figuras;

public class Rectangulo extends Figura{

    private Integer base;
    private Integer altura;
    public Rectangulo(String color, Integer base, Integer altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Integer calcularArea() {
        return base*altura;
    }
}
