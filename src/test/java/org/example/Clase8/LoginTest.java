package org.example.Clase8;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest  extends baseTest{


    @Test

    public void validarLogin() {

        //paso1: validar página
        getDriver().get("https://opencart.abstracta.us/");

        By myAccountBy = By.xpath("//a[@title='My Account']");

    }


}
