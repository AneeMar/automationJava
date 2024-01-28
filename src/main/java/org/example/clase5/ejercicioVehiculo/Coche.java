package org.example.clase5.ejercicioVehiculo;

public class Coche extends Vehiculo{

    private int Cilindrada;
    public Coche(String marca, String modelo, Integer anio, int cilindrada) {
        super(marca, modelo, anio);
        this.Cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }

    @Override
    public void acelerar(){
        System.out.println("El coche esta acelerando...");
    }
}
