package org.example.Clase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.sql.DriverManager.getDriver;

public class HomeTest {


    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        this.driver = new ChromeDriver(options);
    }

    @Test
    public void validarHome() {

        //paso1: validar página
        this.driver.get("https://opencart.abstracta.us/");

        //paso 2: validar aserciones

        By inputBy = By.name("search");
        By carruselBy = By.id("content");
        By menuBy = By.id("menu");
        By myAccountBy = By.xpath("//a[@title='My Account']");

        //hacemos los webelement

        WebElement inputEl = driver.findElement(inputBy);
        WebElement carruselEl = driver.findElement(carruselBy);
        WebElement menuEl = driver.findElement(menuBy);
        WebElement myAccountEl = driver.findElement(myAccountBy);

        //ahora las aserciones propiamente dichas

        Assert.assertTrue(inputEl.isDisplayed(), "no se visualiza el input");
        Assert.assertTrue(carruselEl.isDisplayed(), "no se visualiza el carrusel");
        Assert.assertTrue(menuEl.isDisplayed(), "no se visualiza la navbar");
        Assert.assertTrue(myAccountEl.isDisplayed(), "no se visualiza el menu de MyAccount");


    }

    @AfterMethod
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
