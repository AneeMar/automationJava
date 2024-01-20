package org.example.clase1.clase2;

public class P4Operadores {
    public static void main(String[] args) {

        //Operadores Aritmeticos
        int suma = 10+10;
        int resta = 20-10;
        int multiplicacion = 10*10;
        int division = 30/10;
        int resto = 30%10;

        System.out.println("Operador aritmetico 1: "+suma);
        System.out.println("Operador aritmetico 2: "+resta);
        System.out.println("Operador aritmetico 3: "+multiplicacion);
        System.out.println("Operador aritmetico 4: "+division);
        System.out.println("Operador aritmetico 5: "+resto);

        //Operadores relacionales

        boolean menor = 10<20;
        boolean distinto = 10!=20;
        boolean igualdad = 10==10;

        System.out.println("Operador relacional 1: "+menor);
        System.out.println("Operador relacional 2: "+distinto);
        System.out.println("Operador relacional 3: "+igualdad);

        //Operadores Condicionales

        boolean  and = (10<100) && (20 != 5); //true & true =true
        boolean  or = (10 ==100) || (20 != 5); //false | true = true

        System.out.println("Operador condicional 1: "+and);
        System.out.println("Operador condicional 2: "+or);


    }
}
