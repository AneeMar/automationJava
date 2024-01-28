package org.example.clase5.ejercicioVehiculo;

public class Vehiculo {
    private String Marca;
    private String Modelo;

    private Integer Anio;

    public Vehiculo(String marca, String modelo, Integer anio) {
        Marca = marca;
        Modelo = modelo;
        Anio = anio;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public Integer getAnio() {
        return Anio;
    }

    public void acelerar(){
        System.out.println("El vehiculo esta acelerando...");
    }

    public void frenar(){
        System.out.println("El vehiculo esta frenando...");
    }
}
