package com.Ilana.page;

import com.Ilana.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PrincipalPage  extends Utils{

    private WebDriver driver;
    private Utils utils;

    /**
     * Método constructor de la clase
     * @param driver
     */
    public PrincipalPage(WebDriver driver) {
        super(driver);
    }

    public By cardForms = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[2]/svg");

    /**
     * Método creador para ingresar al formulario
     */
    public WebDriver issngresarFormulario(){
        utils.abrirNavegadorChrome();
        return driver;
    }


    public void ingresarUrl(){
        utils.visit("https://demoqa.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void ingresarFormulario(){
        utils.click(cardForms);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
