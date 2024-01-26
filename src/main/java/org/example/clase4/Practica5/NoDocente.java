package org.example.clase4.Practica5;

import org.example.clase4.practica4.Alumno;
import org.example.clase4.practica4.Persona;

public class NoDocente extends Persona {

    public NoDocente(String nombrePersona, String apellidoPersona) {
        super(nombrePersona, apellidoPersona);
    }

    //sobrescritura del metodo Saludar
    @Override
    public void Saludar(){
        System.out.println("Buenos dias");
    }

}
