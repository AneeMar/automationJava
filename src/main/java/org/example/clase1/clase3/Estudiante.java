package org.example.clase1.clase3;

public class Estudiante {
    //las clases que representan objetos no necesitan del método Main
    //private hace que la clase se encapsule y pueda ser afectada a partir de métodos
    //especificos. Public puede cambiar el valor en cualquier momento y parte

    //Los atributos suelen ser privados

    private Integer id;
    private String nombre;
    private String apellido;
    private Float promedio;

    //creamos el constructor "vacio" de la clase (es opcional)

    //public Estudiante() {}

    //Constructor sin parámetros
    public Estudiante() {
        this(0, "Laura","Opal",7.0f);
    }

    //Ahora un constructor completo, con parámetros

    public Estudiante (Integer id, String nombre, String apellido, Float promedio) {

        this.id = id; //el primer id es atributo, el segundo es parámetro
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;

    }

    //creamos getters y setters

    public Integer getId(){
        return this.id;
    }

    public void setId (Integer id){ //se pone Void porque los setters no devuelven nada
        this.id = id;
    }

    //getter y setter de Nombre

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //con ctrl+insert te da todos los getter y setter que faltan


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }
}
