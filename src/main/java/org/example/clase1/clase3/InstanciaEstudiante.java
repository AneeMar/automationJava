package org.example.clase1.clase3;

public class InstanciaEstudiante {
    public static void main(String[] args) {
        Estudiante AL = new Estudiante(5,"Aurora","Lopez",10.0f);

        System.out.println("Nombre de la estudiante: " + AL.getNombre());

        AL.setPromedio(5.0f);
        System.out.println("El promedio de la estudiante: " + AL.getPromedio());


        //otra forma de instanciar un estudiante, es con el constructor sin parametros

        Estudiante LO = new Estudiante();
        System.out.println("id: "+ LO.getId());
        System.out.println("nombre: "+ LO.getNombre());
        System.out.println("apellido: "+ LO.getApellido());
        System.out.println("promedio: "+ LO.getPromedio());

    }
}
