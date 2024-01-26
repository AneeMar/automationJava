package org.example.clase4.practica4;

import org.example.clase4.Practica5.NoDocente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Para acceder al array en la instancia, es necesario llamarlo y llenarlo primero

        //El alumno necesita la lista de materias, es el primer array que llamamos y llenamos

        List<String> materias = new ArrayList<>();
                materias.add("ciencias naturales");
                materias.add("fisica");
                materias.add("Química");

        // Ahora si, instanciamos el alumno
        Alumno AL = new Alumno ("Aurora","Lopez","123", 10, materias);

        System.out.println("Hola! mi nombre es: "+ AL.getNombrePersona());
        System.out.println("Mi apellido es: "+ AL.getApellidoPersona());
        System.out.println("Mi promedio es: "+ AL.getNota());
        System.out.println("Mi numero de matricula es: "+ AL.getMatricula());
        System.out.println("Las materias a las que voy son: "+ AL.getMaterias());

        //El profesor necesita de una lista de alumnos ya instanciados, por eso va en segundo lugar
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(AL);

        //Recien ahora instanciamos el profesor
        Profesor MrJuan = new Profesor("Juan", "Perez", alumnos);

        NoDocente Portera = new NoDocente("Irina", "Martinez");

        //El siguiente paso es armar una lista de personas y pasarles el metodo Saludar, para que saluden segun corresponda


        List<Persona> personas = new ArrayList<>();
        personas.add(AL);
        personas.add(MrJuan);
        personas.add(Portera);

        for (Persona p : personas) {
            p.Saludar();
        }

    }
}
