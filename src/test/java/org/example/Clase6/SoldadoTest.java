package org.example.Clase6;

import org.example.Clase7.Soldado;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoldadoTest {


    // Estrategia para no instanciar cada vez
     private Soldado sol;
     @BeforeMethod //instanciamos antes de los test
    public void Setup() {
         sol = new Soldado(100);
     }


    @Test
    public void saludDespuesDePelear(){
//primero se instancia
        Soldado soldado1 = new Soldado(50);
 //Despues las acciones a testear, si realmente se cumplen
        soldado1.Pelear(10);
 //por ultimo, las aserciones

        Assert.assertEquals(soldado1.getSalud(), 45, "La salud no corresponde con la esperada");
    }

    @Test

    public void cuandoUnSoldadoMuere(){
        Soldado soldado2=new Soldado(50);
        soldado2.Pelear(150);

        Assert.assertTrue(soldado2.estaMuerto(),"el soldado esta vivo");
    }

    @Test

    public void elSoldadoDescansa(){
        Soldado soldado3 = new Soldado(15);
        soldado3.Descanso();

        Assert.assertEquals(soldado3.getSalud(), 25, "el soldado no descansó nada");
    }

    @Test

    public void elSoldadoEstaVivo(){
         sol.Pelear(50);

         Assert.assertEquals(sol.getSalud(),75);
         Assert.assertFalse(sol.estaMuerto(),"el soldado esta muerto");
    }
}
