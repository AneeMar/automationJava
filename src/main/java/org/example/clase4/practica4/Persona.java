package org.example.clase4.practica4;

public class Persona {

    //atributos
    private String nombrePersona;
    private String apellidoPersona;

    //constructor
    public Persona(String nombrePersona, String apellidoPersona) {

        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;

    }

    //getters y setters
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
}
