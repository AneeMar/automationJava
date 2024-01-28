package org.example.examenPractico.problema2;

public class Torre extends Personaje{

    private Integer Nivel;

    //constructor
    public Torre(Integer Salud, Integer Nivel) {
        super(Salud);

        this.Nivel = Nivel;
    }

    //getter and setter
    public Integer getNivel() {
        return Nivel;
    }

    public void setNivel(Integer nivel) {
        Nivel = nivel;
    }

    //Metodo Entrenar

    @Override
    public void entrenar (){
        setNivel(Nivel+1);
        System.out.println("Excelente entrenamiento! Usted ahora es nivel: " + getNivel());
    }

    //instancia

    public static void main(String[] args) {
        Torre LT = new Torre(50,1);
        LT.entrenar();
    }

}
