package org.duchess.selenium.part4.ex2;

import org.duchess.selenium.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Utiliser des WebElement
 */
public class PortofolioPage {
    private final WebDriver driver;
    
    private WebElement web;
    private WebElement containmentPortfolio;

	public PortofolioPage(WebDriver driver) {
		this.driver = driver;
		driver.get(Util.getPortfolio2());
		
		web = driver.findElement(By.linkText("WEB"));
		containmentPortfolio = driver.findElement(By.id("containment-portfolio"));
	}
	
	public void clickOnWebLink() {
		web.click();
	}
	
	public void clickOnWebLinkAndWaitUntilContainmentPortfolioContainsTwoElements() {
		clickOnWebLink();

        (new WebDriverWait(driver, 10))
                        .until(new ExpectedCondition<Boolean>() {
                            @Override
                            public Boolean apply(WebDriver driver) {
                                return getNumberOfVisibleElementsInContainmentPortfolio() == 2;
                            }
                 });
	}
	
	public int getNumberOfVisibleElementsInContainmentPortfolio() {
		return containmentPortfolio.findElements(By.cssSelector("li:not(.hidden)")).size();
	}

}
