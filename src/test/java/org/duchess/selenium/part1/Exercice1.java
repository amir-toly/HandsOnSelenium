package org.duchess.selenium.part1;


import org.duchess.selenium.Util;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 * No refactoring here to show each step.
 */
public class Exercice1

{
    @Test
    /**
     * Ce test s'assure que lors d'un clic sur le lien "about" alors la page qui s'affiche a bien pour titre "About"
     * Il vous faut ajouter du code ici, sans modifier le code déjà écrit, ni le code html pour faire passer le test.
     */
    public void when_clicking_to_link_about_then_page_is_about() throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get(Util.getHome());

        // ADD CODE HERE

        assertThat(driver.getTitle()).isEqualTo("About");
        driver.quit();
    }

    @Test
    /**
     * Ce test s'assure que lors d'un clic sur le lien "blog" alors la page qui s'affiche a bien pour titre "Blog"
     * Il vous faut ajouter du code ici, sans modifier le code déjà écrit, ni le code html  pour faire passer le test.
     */ public void when_clicking_to_link_blog_then_page_blog() throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get(Util.getHome());

        // ADD CODE HERE

        assertThat(driver.getTitle()).isEqualTo("Blog");
        driver.quit();
    }
}
