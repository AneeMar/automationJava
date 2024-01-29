package org.example.Clase5.practicasDeClase.Figuras;

public interface Dibujable {

    void dibujar();

    default void borrar(){
        System.out.println("Borrando figura...");
    }
}
