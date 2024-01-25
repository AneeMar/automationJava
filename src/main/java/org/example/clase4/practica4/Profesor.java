package org.example.clase4.practica4;

import java.util.List;

public class Profesor extends Persona {

    //Atributos del Profesor
    private List<Alumno> alumnos;

    //Constructor
    public Profesor(String nombrePersona, String apellidoPersona,List<Alumno> alumnos) {
        super(nombrePersona, apellidoPersona);
        this.alumnos = alumnos;

    }

    //getter y setter

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    //ojo con el setter de las listas!
    public void setAlumnos(Alumno alumno) {
        this.alumnos.add (alumno);
    }
}
