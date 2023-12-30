package com.Ilana.page;

import com.Ilana.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends Utils {

    private WebDriver driver;
    private Utils utils;

    /**
     * Método constructor de la clase
     *
     * @param driver
     */
    public PracticeFormPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new Utils(driver);
    }

    public By menuPracticeForm = By.xpath("");
    public By txtFirstName = By.xpath("");
    public By txtLastName = By.xpath("");
    public By txtEmail = By.xpath("");
    public By rdnGenderM = By.xpath("");
    public By txtNumMobile = By.xpath("");
    public By txtDateBirth = By.xpath("");

    /**
     * Método creado para ingresar al menu de Practice Form
     */
    public void ingresarMenu() {
        utils.click(menuPracticeForm);
        utils.waitForLoading(10, 250);
    }

    /**
     * Método creado para llenar formulario
     *
     * @param nombre
     * @param apellido
     * @param email
     * @param numCelular
     * @param fecNacimiento
     */
    public void llenarFormulario(String nombre, String apellido, String email, String numCelular, String fecNacimiento) {
        utils.type(txtFirstName, nombre);
        utils.type(txtLastName, apellido);
        utils.type(txtEmail, email);
        utils.click(rdnGenderM);
        utils.type(txtNumMobile, numCelular);
        utils.type(txtDateBirth, fecNacimiento);
    }
}
