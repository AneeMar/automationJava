package org.example.examenPractico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadoraPrueba = new Calculadora();

        Scanner numeros = new Scanner(System.in);
        Scanner Operaciones = new Scanner(System.in);
        int Contador = 0;

        do {
            //cuerpo de la calculadora

            System.out.println("ingrese el primer número entero");
            Integer numeroUno = numeros.nextInt();
            calculadoraPrueba.setNum1(numeroUno);

            System.out.println("numero guardado exitosamente!");

            System.out.println("ingrese el segundo número entero");
            Integer numeroDos = numeros.nextInt();
            calculadoraPrueba.setNum2(numeroDos);

            System.out.println("numero guardado exitosamente!");


            //Operaciones de la calculadora

            System.out.println("Ingrese una operación. Para suma: +, Para resta: -, Para Multiplicación: * y Para División: /");

            String operaciones = Operaciones.nextLine();


            switch (operaciones) {
                case "+":
                    //System.out.println("El resultado de la suma es: " + calculadoraPrueba.Suma(numeroUno,numeroDos)); <- esta opción va acompañada con el metodo Suma publico
                    System.out.println("El resultado de la suma es: " + calculadoraPrueba.getSuma());
                    calculadoraPrueba.setResultado(calculadoraPrueba.getSuma());
                    break;
                case "-":
                    System.out.println("El resultado de la resta es: " + calculadoraPrueba.getResta());
                    calculadoraPrueba.setResultado(calculadoraPrueba.getResta());
                    break;
                case "*":
                    System.out.println("El resultado de la Multiplicación es: " + calculadoraPrueba.getMultiplicacion());
                    calculadoraPrueba.setResultado(calculadoraPrueba.getMultiplicacion());
                    break;
                case "/":
                    System.out.println("El resultado de la División es: " + calculadoraPrueba.getDivision());
                    calculadoraPrueba.setResultado(calculadoraPrueba.getDivision());
                    break;
                default:
                    System.out.println("Operación invalida");
                    //System.out.println("el resultado de operacion invalida es: " + calculadoraPrueba.getResultado());
            }

            //HASTA ACA ESTA BIEN, ME LOS GUARDA TENGO QUE RESOLVER QUE HACER CON EL ULTIMO CASO

            Integer resultadoFinal = calculadoraPrueba.getResultado();

            if (resultadoFinal < 0) {
                System.out.println("Cuidado, tu resultado es negativo!");
            } else if (resultadoFinal > 0 && resultadoFinal < 10000) {
                System.out.println("Resultado dentro de los limites");
            } else if (resultadoFinal > 10000) {
                System.out.println("Error: resultado muy grande");
            } else {
                   System.out.println("No se pudo procesar resultado, intente nuevamente con una operación válida.");

            }


            Contador++;

        } while (Contador < 5);


    }
}
