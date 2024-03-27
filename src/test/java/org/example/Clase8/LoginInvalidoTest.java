package org.example.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInvalidoTest extends baseTest{

    @Test

    public void loginInvalido() {

    //paso1: validar página
    getDriver().get("https://opencart.abstracta.us/");

    //click en My Account
    By myAccountBy = By.xpath("//a[@title='My Account']");
    WebElement myAccountEl = getDriver().findElement(myAccountBy);
        myAccountEl.click();

    //click en login
    By LoginBy = By.xpath("//a[text()='Login']");
    WebElement LoginEl = getDriver().findElement(LoginBy);
        LoginEl.click();

    //Llenar con los datos

    By emailInput = By.id("input-email");
    By pswdInput = By.id("input-password");

    WebElement emailInputEl = getDriver().findElement(emailInput);
    WebElement pswdInputEl = getDriver().findElement(pswdInput);

        emailInputEl.sendKeys("melba@email.com");
        pswdInputEl.sendKeys("contraseñaErronea");

    //click en login

    By submitButton = By.xpath("//input[@value='Login']");
    WebElement loginButtonEl = getDriver().findElement(submitButton);
        loginButtonEl.click();

    //validaciones

    By warningBy = By.xpath("//div[contains(text(),\"No match\")]");
    WebElement warningEl = getDriver().findElement(warningBy);
        Assert.assertTrue(warningEl.isDisplayed());

    }
}
