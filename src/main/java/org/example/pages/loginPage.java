package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

    private WebDriver driver;
    private By emailInput = By.id("input-email");
    private By pswdInput = By.id("input-password");
    private By submitButton = By.xpath("//input[@value='Login']");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }
    public void llenarDatos(String email, String pass){
        WebElement emailInputEl = driver.findElement(emailInput);
        WebElement pswdInputEl = driver.findElement(pswdInput);
        emailInputEl.sendKeys(email);
        pswdInputEl.sendKeys(pass);
    }

    public void clickLoginPageButton(){
        WebElement loginButtonEl = driver.findElement(submitButton);
        loginButtonEl.click();
    }
}
