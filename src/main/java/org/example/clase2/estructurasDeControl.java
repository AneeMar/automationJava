package org.example.clase2;

public class estructurasDeControl {
    public static void main(String[] args) {
        int var1=100;
        int var2=200;

        if (var1 < var2) {
            System.out.println("es menor");
        }

        int var3=300;
        int var4=400;

        if (var3 > var4) {
            System.out.println("es menor");
        } else {
            System.out.println("es mayor");
        }


        //En este caso, el swich y el if else son equivalentes


        String diaDeLaSemana = "Domingo";

        switch (diaDeLaSemana){

            case "Lunes":
                System.out.println("Hoy es Lunes");
                break;
            case "Martes":
                System.out.println("Hoy es Martes");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes");
                break;
            default:
                System.out.println("Buen Fin de semana!");
        }

        if (diaDeLaSemana == "Lunes") {
            System.out.println("Hoy es Lunes");
        } else if (diaDeLaSemana == "Martes"){
            System.out.println("Hoy es Martes");
        } else if (diaDeLaSemana == "Miercoles"){
            System.out.println("Hoy es Miercoles");
        } else if (diaDeLaSemana == "Jueves") {
            System.out.println("Hoy es Jueves");
        } else if (diaDeLaSemana == "Viernes") {
            System.out.println("Hoy es Viernes");
        } else {
            System.out.println("Buen fin de semana!");
        }
    }
}
