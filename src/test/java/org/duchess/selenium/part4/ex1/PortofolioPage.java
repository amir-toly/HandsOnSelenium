package org.duchess.selenium.part4.ex1;

import org.duchess.selenium.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PortofolioPage {
    private final WebDriver driver;

	public PortofolioPage(WebDriver driver) {
		this.driver = driver;
		driver.get(Util.getPortfolio2());
	}
	
	public void clickOnWebLink() {
		driver.findElement(By.ByLinkText.linkText("WEB")).click();
	}
	
	public void clickOnWebLinkAndWaitUntilContainmentPortfolioContainsTwoElements() {
		clickOnWebLink();

        (new WebDriverWait(driver, 10))
                        .until(new ExpectedCondition<Boolean>() {
                            @Override
                            public Boolean apply(WebDriver driver) {
                                return driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size() == 2;
                            }
                 });
	}

}
