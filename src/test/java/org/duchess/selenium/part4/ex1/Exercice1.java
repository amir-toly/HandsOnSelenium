package org.duchess.selenium.part4.ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Objectif : Reprendre le code de l'exercice précédent.
 * Utiliser le page object pattern.
 * <p/>
 * Il vous faudra = initialiser l'objet portofolioPage (sans utiliser de webelements) + coder les 2 méthodes
 */
public class Exercice1 {

    private WebDriver driver;
    private PortofolioPage portofolioPage;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        portofolioPage = new PortofolioPage(driver);
    }

    @Test
    public void when_click_to_next_then_new_datas_with_implicit_wait() {
    	portofolioPage.clickOnWebLinkAndWaitUntilContainmentPortfolioContainsTwoElements();
    	
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size()).isEqualTo(2);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
