package com.Ilana.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Clase utilizada para crear utilidades del proyecto
 */
public class Utils {

    private static WebDriver driver;

    /**
     * Método constructor de la clase
     *
     * @param driver
     */
    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Método creado para abrir el navegador
     *
     * @return
     */
    public static WebDriver abrirNavegadorChrome(String url) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    /**
     * Método creado para encontrar el localizador de un elemento
     *
     * @param locator
     * @return
     */
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    /**
     * Método creador para escribir texto en un elemento de tipo text
     *
     * @param inputText
     * @param locator
     */
    public void type(By locator, String inputText) {
        driver.findElement(locator).sendKeys(inputText);
    }

    /**
     * Método creado para dar clic a un elemento
     *
     * @param locator
     */
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void waitForLoading(Integer wait, Integer polling) {
        WebDriverWait waitLoading = new WebDriverWait(this.driver, (long) wait, (long) polling);
    }

    /**
     * Método creador para afirmar que dos cadenas son iguales.
     *
     * @param actual
     * @param expected
     * @param message
     */
    public void assertEquals(String actual, String expected, String message) {
        assertEquals(actual, expected, message);
    }
}
