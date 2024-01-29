package org.example.examenPractico.problema2;

public class InstanciaProblema2 {
    public static void main(String[] args) {
        Mago Merlin = new Mago(50, "Desaparecer");
        Merlin.entrenar();

        Espadachin Uno = new Espadachin(50,0);
        Uno.entrenar();

        Torre LT = new Torre(50,1);
        LT.entrenar();
    }
}
