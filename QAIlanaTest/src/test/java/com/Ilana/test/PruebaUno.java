package com.Ilana.test;

import com.Ilana.page.PrincipalPage;
import com.Ilana.utils.Utils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PruebaUno {

    private WebDriver driver;
    private PrincipalPage principalPage;
    private Utils utils;

    @Before
    public void iniciar() {
        principalPage = new PrincipalPage(driver);
        driver = principalPage.abrirNavegadorChrome();
        principalPage.ingresarUrl();
    }


    @Test
    public void pruebaUno() {

        principalPage.ingresarFormulario();

    }

    @After
    public void cerrar() {
        driver.close();
    }
}
