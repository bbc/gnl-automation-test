package com.bbc.selenium.pages.generic;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrivacyPolicyPage {

    WebDriver driver;

    private String closeButtonId = "bbcprivacy-continue-button";

    public PrivacyPolicyPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCloseButton() {
        return driver.findElement(By.id(closeButtonId));
    }

    public void assertPrivacyPolicyIsNotVisible() {
        try {
            Assert.assertFalse(getCloseButton().isDisplayed());
        } catch (NoSuchElementException e) {
            // This is expected
        }
    }
}
