package org.example.Clase7;

public class Soldado {
    private Integer Salud;

    public Integer getSalud() {
        return Salud;
    }

    public void setSalud(Integer salud) {
        Salud = salud;
    }

    public Soldado(Integer salud) {
        Salud = salud;
    }

    public void Pelear ( Integer Ataque) {
        Salud -= Ataque /2;
    }

    public void Descanso () {
        Salud  += 10;
    }

    public boolean estaMuerto() {
        return Salud <=0;
    }
}
