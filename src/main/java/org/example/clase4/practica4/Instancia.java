package org.example.clase4.practica4;

import java.util.ArrayList;
import java.util.List;

public class Instancia {
    public static void main(String[] args) {

        //Para acceder al array en la instancia, es necesario llamarlo y llenarlo primero
        List<String> materias = new ArrayList<>();
                materias.add("ciencias naturales");
                materias.add("fisica");
                materias.add("Química");

        Alumno AL = new Alumno ("Aurora","Lopez","123", 10, materias);

        System.out.println("Hola! mi nombre es: "+ AL.getNombrePersona());
        System.out.println("Mi apellido es: "+ AL.getApellidoPersona());
        System.out.println("Mi promedio es: "+ AL.getNota());
        System.out.println("Mi numero de matricula es: "+ AL.getMatricula());
        System.out.println("Las materias a las que voy son: "+ AL.getMaterias());
    }
}
