package com.Ilana.page;

import com.Ilana.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Clase creada para ingresar a la pantalla principal
 */
public class PrincipalPage extends Utils {

    private WebDriver driver;
    private Utils utils;
    private PracticeFormPage practiceFormPage;
    private ElementsPage elementsPage;

    /**
     * Método constructor de la clase
     *
     * @param driver
     */
    public PrincipalPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new Utils(driver);
        practiceFormPage = new PracticeFormPage(driver);
    }

    public By cardForms = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]");
    public By cardElements = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[2]/svg/path");

    /**
     * Método creado para ingresar a la card Forms
     * @return
     */
    public PracticeFormPage ingresarFormulario() {
        utils.click(cardForms);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return practiceFormPage;
    }

    /**
     * Método creado para ingresar a la card Elements
     * @return
     */
    public ElementsPage ingresarElementos() {
        utils.click(cardElements);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return elementsPage;
    }
}
