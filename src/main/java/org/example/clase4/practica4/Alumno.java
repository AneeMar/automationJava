package org.example.clase4.practica4;

import java.util.List;

//extends es para heredar de otra clase padre
public class Alumno extends Persona {

    //Atributos de Alumno

    private String matricula;
    private Integer nota;
    private List<String> materias;

    //Constructor
    //si la clase padre tiene un constructor, la clase hija tiene que llamarlo
    public Alumno(String nombrePersona, String apellidoPersona, String matricula, Integer nota,List<String> materias) {
        super(nombrePersona, apellidoPersona);
        this.matricula = matricula;
        this.nota = nota;
        this.materias = materias;
    }

    //Getter y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public List<String> getMaterias() {
        return materias;
    }

    public void setMaterias(String materia) {
        this.materias.add(materia);
    }
}
