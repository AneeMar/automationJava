package org.example.examenPractico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadoraPrueba = new Calculadora();

         Scanner numeros = new Scanner(System.in);
         Scanner Operaciones = new Scanner(System.in);


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

    System.out.println("Ingrese una operación: +, -, * o /");

    String operaciones = Operaciones.nextLine();

//HASTA ACA ESTA BIEN, ME LOS GUARDA

    switch (operaciones) {
        case "+":
        //System.out.println("El resultado de la suma es: " + calculadoraPrueba.Suma(numeroUno,numeroDos)); <- esta opción va acompañada con el metodo Suma publico
        System.out.println("El resultado de la suma es: " + calculadoraPrueba.getSuma());
        break;
        case "-":
        System.out.println("El resultado de la resta es: " + calculadoraPrueba.getResta());
        break;
        case "*":
        System.out.println("El resultado de la Multiplicación es: " + calculadoraPrueba.getMultiplicacion());
        break;
        case "/":
        System.out.println("El resultado de la División es: " + calculadoraPrueba.getDivision());
        break;
        default:
        System.out.println("Operación invalida");
    }
    }
}
