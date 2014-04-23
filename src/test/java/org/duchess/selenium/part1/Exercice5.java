package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice5

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();

    }

    @Test
    /**
     * Utiliser le back du navigateur
     */
    public void when_going_back_then_page_is_feature() {
        driver.get(Util.getFeatures());
        driver.get(Util.getHome());

        //ADD CODE HERE

        assertThat(driver.getTitle()).isEqualTo("Features");
    }


    @After
    public void afterTest() {
        driver.quit();
    }
}
