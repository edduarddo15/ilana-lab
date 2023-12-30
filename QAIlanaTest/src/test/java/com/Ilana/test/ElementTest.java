package com.Ilana.test;


import com.Ilana.page.ElementsPage;
import com.Ilana.page.LinksPage;
import com.Ilana.page.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ElementTest {
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
    public void validarLinks() {
        ElementsPage elementsPage = principalPage.ingresarElementos();
        LinksPage linksPage = elementsPage.links();
        linksPage.ingresarLinkCreated();
        linksPage.validarMensaje201();
        linksPage.ingresarLinkNoContent();
        linksPage.validarMensaje204();
        linksPage.ingresarLinkMoved();
        linksPage.validarMensaje301();
        linksPage.ingresarLinkBadRequest();
        linksPage.validarMensaje400();
        linksPage.ingresarLinkUnauthorized();
        linksPage.validarMensaje401();
        linksPage.ingresarLinkForbidden();
        linksPage.validarMensaje403();
        linksPage.ingresarLinkNotFound();
        linksPage.validarMensaje404();
    }

    /**
     * Método encargado de cerrar driver
     */
    @After
    public void cerrar() {
        driver.close();
    }
}