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

    //sobrescritura del metodo Saludar
    @Override
    public void Saludar(){
        System.out.println("Hola a todos");
    }

    //sobrecarga metodo Calificar

    /*En Profesor se debe implementar un método calificar() sobrecargado
● Si calificar recibe un Alumno y la nota, agrega a ese alumno la nota
*/

    public void Calificar (Alumno alumno, Integer nota){
        alumno.setNota(nota);
    }

    //● Si calificar solo recibe una nota, agrega a todos sus alumnos la misma nota (usar for each)
    /*El for each necesita una variable del mismo tipo que los elementos de la lista que quiero iterar,
    y el nombre de la lista*/
    public void Calificar (Integer nota) {
        for (Alumno a : alumnos) {
            a.setNota(nota);
        }
    }
}
