package org.example.examenPractico.problema2;

public class Mago extends Personaje{

    private String Magia;

    //constructor
    public Mago(Integer Salud, String Magia) {
        super(Salud);
        this.Magia = Magia;
    }

    //getter y setter
    public String getMagia() {
        return Magia;
    }

    public void setMagia(String magia) {
        Magia = magia;
    }

    //Entrenando

    @Override
    public void entrenar (){
        System.out.println("Los magos no necesitamos entrenar! Voy a proceder a mostrarte. ");
        System.out.println("Magia activada: "+ getMagia());
    }




}
