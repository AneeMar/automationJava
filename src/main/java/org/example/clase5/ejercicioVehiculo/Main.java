package org.example.clase5.ejercicioVehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo TC = new Vehiculo("Toyota", "Corolla", 2020);

        Coche FM = new Coche("Ford", "Mustang", 2021, 5000);

        //Detalles de Vehiculo

        System.out.println("El vehiculo que usted esta consultando es un " + TC.getMarca() + " " + TC.getModelo() + " del año " + TC.getAnio() + ".");
        TC.acelerar();

        //Detalles del coche

        System.out.println("");

        System.out.println("El coche que usted esta consultando es un " + FM.getMarca() + " " + FM.getModelo() + " del año " + FM.getAnio() + "." + "Sus cilindradas son: " + FM.getCilindrada() + ".");
        FM.acelerar();

    }
}
