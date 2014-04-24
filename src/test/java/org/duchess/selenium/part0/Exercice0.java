package org.duchess.selenium.part0;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;

/**
 * Pour les 3 premiers, lancer une instance de navigateur pour chacun des navigateurs présents sur votre machine.
 * Le dernier est un navigateur "headless" et donc concerne tout le monde.
 */
public class Exercice0 {

    @Test
    /**
     *    If you have firefox
     */
    public void when_trying_firefox_then_firefox_is_used() throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.close();
    }

    @Test
    /**
     *    If you have IE
     */
    public void when_trying_internet_explorer_then_firefox_is_used() throws IOException {
        WebDriver driver = null;
        driver.close();
    }

    @Test
    /**
     *    If you have chrome
     */
    public void when_trying_chromedriver_then_chrome_is_used() throws IOException {
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver","<path to Chromedriver .exe>");


        driver.close();
    }

    @Test
    public void when_trying_htmldriver_then_html_driver_is_used() throws IOException {
        WebDriver driver = new HtmlUnitDriver();
        driver.close();
    }


}
