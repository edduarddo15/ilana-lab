package com.Ilana.test;

import com.Ilana.page.PracticeFormPage;
import com.Ilana.page.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DiligenciarFormularioTest {

    private WebDriver driver;
    private PrincipalPage principalPage;

    /**
     * Método creado para implementar instancias antes de ejecutar el test
     */
    @Before
    public void iniciar() {
        driver = principalPage.abrirNavegadorChrome("https://demoqa.com/");
        principalPage = new PrincipalPage(driver);
    }

    /**
     * Método test
     */
    @Test
    public void diligenciarFormulario() {
        PracticeFormPage practiceFormPage = principalPage.ingresarFormulario();
        practiceFormPage.ingresarMenu();
        practiceFormPage.llenarFormulario(
                "Eduardo",
                "Silva",
                "edosilva.1517@gmail.com",
                "3163723587",
                "10 Apr 1984");
    }

    /**
     * Método encargado de cerrar driver
     */
    @After
    public void cerrar() {
        driver.close();
    }
}
