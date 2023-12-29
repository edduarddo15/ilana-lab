package com.Ilana.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Utils {

    private WebDriver driver;

    /**
     * Método constructor de la clase
     * @param driver
     */
    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Método creado para abrir el navegador
     * @return
     */
    public WebDriver abrirNavegadorChrome(){
        System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    /**
     * Método creado para ingresar a la url
     * @return
     */
    public void visit(String url){
        driver.get(url);
    }

    /**
     * Método creado para encontrar el localizador de un elemento
     * @param locator
     * @return
     */
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    /**
     * Método creado para encontrar el localizador de un elemento tipo lista
     * @param locator
     * @return
     */
    public List<WebElement> selectOptionList(By locator){
        return driver.findElements(locator);
    }

    /**
     * Método creador para escribir texto en un elemento de tipo text
     * @param inputText
     * @param locator
     */
    public void type (String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    /**
     * Método creado para dar clic a un elemento
     * @param locator
     */
    public void click (By locator){
        driver.findElement(locator).click();
    }

}
