package org.example.examenPractico.problema1;

public class Calculadora {
    private Integer num1;
    private Integer num2;

    private Integer Resultado;

//CONSTRUCTORES


/*  Para esta solucion sirve más el constructor vacío

    public Calculadora(Integer num1, Integer num2) {
       this.num1 = num1;
        this.num2 = num2;
  }*/

    public Calculadora (){

    }

    //METODOS SETTER Y GETTER

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

    public Integer getResultado() {
        return Resultado;
    }

    public void setResultado(Integer resultado) {
        Resultado = resultado;
    }

    //METODOS DE OPERACIÓN


    /*esta opcion seguro que anda, pero el método es publico y poco recomendable

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
