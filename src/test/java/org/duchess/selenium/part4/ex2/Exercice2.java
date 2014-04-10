package org.duchess.selenium.part4.ex2;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Objectif : Reprendre le code de l'exercice précédent.
 * Utiliser le page object pattern.
 * <p/>
 * Il vous faudra = initialiser l'objet portofolioPage (en utilisant les WebElements) + coder les 2 méthodes
 */
public class Exercice2 {

    private WebDriver driver;
    private PortofolioPage portofolioPage;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getPortfolio2());
        portofolioPage = PageFactory.initElements(driver, PortofolioPage.class);
    }

    @Test
    public void when_click_to_next_then_new_datas_with_implicit_wait() {
        portofolioPage.filterElemsByWeb();
        assertThat(portofolioPage.getNumberOfVisibleElements()).isEqualTo(2);
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
