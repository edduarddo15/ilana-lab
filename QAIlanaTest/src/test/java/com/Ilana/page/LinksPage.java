package com.Ilana.page;

import com.Ilana.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Clase creada para ingresar a la página de links
 */
public class LinksPage {

    private WebDriver driver;
    private Utils utils;

    public LinksPage(WebDriver driver, Utils utils) {
        this.utils = utils;
        this.driver = driver;
    }

    public By lnkHome = By.xpath("");
    public By lnkHome4MPDl = By.xpath("");
    public By lnkCreated = By.xpath("");
    public By lnkNoContent = By.xpath("");
    public By lnkMoved = By.xpath("");
    public By lnkBadRequest = By.xpath("");
    public By lnkUnauthorized = By.xpath("");
    public By lnkForbidden = By.xpath("");
    public By lnkNotFound = By.xpath("");
    public By msn201 = By.xpath("");
    public By msn204 = By.xpath("");
    public By msn301 = By.xpath("");
    public By msn400 = By.xpath("");
    public By msn401 = By.xpath("");
    public By msn403 = By.xpath("");
    public By msn404 = By.xpath("");

    // Métodos creados para ingresar a cada uno de los links
    public void ingresarLinkCreated(){
        utils.click(lnkCreated);
    }

    public void ingresarLinkNoContent(){
        utils.click(lnkNoContent);
    }

    public void ingresarLinkMoved(){
        utils.click(lnkMoved);
    }

    public void ingresarLinkBadRequest(){
        utils.click(lnkBadRequest);
    }

    public void ingresarLinkUnauthorized(){
        utils.click(lnkUnauthorized);
    }

    public void ingresarLinkForbidden(){
        utils.click(lnkForbidden);
    }

    public void ingresarLinkNotFound(){
        utils.click(lnkNotFound);
    }

    // Métodos creados para validar el mensaje de cada uno de los links
    public void validarMensaje201(){
        utils.assertEquals(
                utils.findElement(msn201).getText(),
                "Link has responded with staus 201 and status text Created",
                "Mensaje link Created  incorrecto");
    }

    public void validarMensaje204(){
        utils.assertEquals(
                utils.findElement(msn204).getText(),
                "Link has responded with staus 204 and status text No Content",
                "Mensaje link No Content  incorrecto");
    }

    public void validarMensaje301(){
        utils.assertEquals(
                utils.findElement(msn301).getText(),
                "Link has responded with staus 301 and status text Moved Permanently",
                "Mensaje link Moved incorrecto");
    }

    public void validarMensaje400(){
        utils.assertEquals(
                utils.findElement(msn400).getText(),
                "Link has responded with staus 400 and status text Bad Request",
                "Mensaje link Bad Request incorrecto");
    }

    public void validarMensaje401(){
        utils.assertEquals(
                utils.findElement(msn401).getText(),
                "Link has responded with staus 401 and status text Unauthorized",
                "Mensaje link Unauthorized incorrecto");
    }

    public void validarMensaje403(){
        utils.assertEquals(
                utils.findElement(msn403).getText(),
                "Link has responded with staus 403 and status text Forbidden",
                "Mensaje link Forbidden incorrecto");
    }

    public void validarMensaje404(){
        utils.assertEquals(
                utils.findElement(msn404).getText(),
                "Link has responded with staus 404 and status text Not Found",
                "Mensaje link Not Found incorrecto");
    }
}
