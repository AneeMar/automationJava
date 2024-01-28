package org.example.examenPractico.problema2;

public class Personaje {

    private Integer Salud;

    //constructor
    public Personaje(Integer Salud) {
        this.Salud = Salud;
    }

    //metodo entrenar
    public void entrenar (){
        System.out.println("estado: Entrenando...");
    }

    //getter y setter
    public Integer getSalud() {
        return Salud;
    }

    public void setSalud(Integer salud) {
        Salud = salud;
    }
}
