package org.example.examenPractico.problema2;

public abstract class Personaje {

    private Integer Salud;

    //constructor
    public Personaje(Integer Salud) {
        this.Salud = Salud;
    }

    //metodo entrenar
    public abstract void entrenar ();

    //getter y setter
    public Integer getSalud() {
        return Salud;
    }

    public void setSalud(Integer salud) {
        Salud = salud;
    }
}
