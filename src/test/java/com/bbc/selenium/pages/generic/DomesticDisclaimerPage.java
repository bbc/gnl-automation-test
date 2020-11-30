package com.bbc.selenium.pages.generic;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DomesticDisclaimerPage {

    WebDriver driver;
    private String closeButtonCSS = "#close-disclaimer > div";

    public DomesticDisclaimerPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCloseButton() {
        return driver.findElement(By.cssSelector(closeButtonCSS));
    }

    public void assertDomesticDisclaimerIsNotVisible() {
        try {
            Assert.assertFalse(getCloseButton().isDisplayed());
        } catch (NoSuchElementException e) {
            // This is expected
        }
    }
}
