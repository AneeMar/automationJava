package org.example.examenPractico.problema2;

public class Torre extends Personaje{

    private Integer Nivel;
    public Torre(Integer Salud, Integer Nivel) {
        super(Salud);

        this.Nivel = Nivel;
    }

    public Integer getNivel() {
        return Nivel;
    }

    public void setNivel(Integer nivel) {
        Nivel = nivel;
    }
}
