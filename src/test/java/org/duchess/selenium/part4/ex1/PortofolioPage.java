package org.duchess.selenium.part4.ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rigabertm on 10/04/14.
 */
public class PortofolioPage {
    private final WebDriver driver;

    public PortofolioPage(WebDriver driver) {
        this.driver = driver;
    }

    public void filterElemsByWeb() {
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        (new WebDriverWait(driver, 10))
                               .until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#containment-portfolio li.video")));

    }

    public Integer getNumberOfVisibleElements() {
        return driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size();
    }
}
