package org.example.examenPractico.problema2;

public class Espadachin extends Personaje{

    private Integer ataque;

    //constructor
    public Espadachin(Integer Salud, Integer ataque) {
        super(Salud);
        this.ataque = ataque;
}

    //getter and setter
    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    //metodo Entrenar
    @Override
    public void entrenar (){
        setAtaque(ataque+10);
        System.out.println("Excelente entrenamiento! Usted ahora tiene: " + getAtaque() + " puntos de ataque.");
    }


}
