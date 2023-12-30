package com.Ilana.page;

import com.Ilana.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Clase creada para gestionar la card Elements
 */
public class ElementsPage extends Utils {

    private WebDriver driver;
    private Utils utils;
    private LinksPage linksPage;

    /**
     * Método constructor de la clase
     *
     * @param driver
     */
    public ElementsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        utils = new Utils(driver);
    }

    public By mnuLinks = By.xpath("");

    /**
     * Método creado para ingresar al menú
     */
    public LinksPage links() {
        utils.click(mnuLinks);
        utils.waitForLoading(10, 250);
        return linksPage;
    }
}