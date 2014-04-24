package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice6

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getFeatures());

    }

    @Test
    /**
     * Ajouter du code javascript pour modifier le texte de l'élement bigbutton en toto
     */
    public void when_setting_text_of_bigbutton_to_toto_using_javascript_then_text_is_changed() {
        //ADD CODE HERE

        assertThat(driver.findElement(By.id("bigbutton")).getText()).isEqualTo("TOTO");
    }

    @Test
    //Don't spend a lot of time in this one. Call us and we will explain it for you.
    public void when_setting_bigbutton_with_text_toto_with_javascript_then_surprised() {
        //ADD CODE HERE

        assertThat(driver.findElement(By.id("bigbutton")).getText()).isEqualTo("toto");
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
