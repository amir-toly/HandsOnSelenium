package org.duchess.selenium.part4.ex2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by rigabertm on 10/04/14.
 */
public class PortofolioPage {
    private final WebDriver driver;
    @FindBy(linkText = "WEB")
    WebElement web;
    @FindBys(@FindBy(css = "#containment-portfolio li:not(.hidden)"))
    List<WebElement> elementVisible;
    @FindBy(css = "#containment-portfolio li.video")
    WebElement video;


    public PortofolioPage(WebDriver driver) {
        this.driver = driver;
    }

    public void filterElemsByWeb() {
        web.click();
        (new WebDriverWait(driver, 10))
                        .until(new ExpectedCondition<Boolean>() {
                            @Override
                            public Boolean apply(WebDriver driver) {
                                return video.isDisplayed() == false;
                            }
                        });

    }

    public Integer getNumberOfVisibleElements() {
        return elementVisible.size();
    }
}
