package org.duchess.selenium.part1;


import org.duchess.selenium.Util;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice0

{
    @Test
    /**
     * Ici, il faut seulement ajouter du code pour faire en sorte que le test passe.
     *
     */
    public void when_go_to_index_then_index_page_is_on_screen() throws IOException {
        //init driver
        WebDriver driver = new FirefoxDriver();

         String pageUrl = Util.getHome();

        //go to page -   Util.getHome() return the url path for this handson
        driver.get(pageUrl);


        assertThat(driver.getTitle()).isEqualTo("Home");

        //Close the driver
        driver.quit();


    }

}
