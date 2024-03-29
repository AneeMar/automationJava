package org.example.Clase8;

import org.example.pages.homePage;
import org.example.pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends baseTest{


    @Test

    public void validarLogin() {

        homePage HomePage = new homePage(getDriver());
        loginPage LoginPage = new loginPage(getDriver());

        //paso1: validar página
        getDriver().get("https://opencart.abstracta.us/");

        /*click en My Account
        By myAccountBy = By.xpath("//a[@title='My Account']");
        WebElement myAccountEl = getDriver().findElement(myAccountBy);
        myAccountEl.click();

        //click en login
        By LoginBy = By.xpath("//a[text()='Login']");
        WebElement LoginEl = getDriver().findElement(LoginBy);
        LoginEl.click();*/

        HomePage.clickMyAccount();
        HomePage.clickLoginButton();

        /*Llenar con los datos

        By emailInput = By.id("input-email");
        By pswdInput = By.id("input-password");

        WebElement emailInputEl = getDriver().findElement(emailInput);
        WebElement pswdInputEl = getDriver().findElement(pswdInput);

        emailInputEl.sendKeys("melbalorenzo@email.com");
        pswdInputEl.sendKeys("melbaLorenzo");

        //click en login

        By submitButton = By.xpath("//input[@value='Login']");
        WebElement loginButtonEl = getDriver().findElement(submitButton);
        loginButtonEl.click();*/

        LoginPage.llenarDatos("melbalorenzo@email.com", "mabelLornezo");
        LoginPage.clickLoginPageButton();

        //validaciones

        By titleBy = By.xpath("//a[@title='My Account']");
        WebElement titleEl = getDriver().findElement(titleBy);
        Assert.assertTrue(titleEl.isDisplayed());
        
    }


}
