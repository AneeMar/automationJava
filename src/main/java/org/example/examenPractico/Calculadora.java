package org.example.examenPractico;

public class Calculadora {
    private Integer num1;
    private Integer num2;


//    public Calculadora(Integer num1, Integer num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }

    public Calculadora (){

    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    /*esta opcion seguro que anda

    public Integer Suma (Integer num1, Integer num2){
        int Suma = num1 +  num2;
        return Suma;
    }
*/
    int Suma;
    private Integer Suma (Integer num1, Integer num2){
        return Suma;
    }

    public Integer getSuma(){
        Suma = num1 +  num2;
        return Suma;
    }



    int Resta;
    private Integer Resta (Integer num1, Integer num2){
        return Resta;
    }

    public Integer getResta() {
        Resta = num1 - num2;
        return Resta;

    }

    int Multiplicacion;

    private Integer Multiplicacion (Integer num1, Integer num2){
        return Multiplicacion;
    }

    public Integer getMultiplicacion() {
        Multiplicacion = num1 * num2;
        return Multiplicacion;
    }

    int Division;

    private Integer Division (Integer num1, Integer num2){
        return Division;
    }

    public Integer getDivision() {
        Division = num1 / num2;
        return Division;
    }


}
