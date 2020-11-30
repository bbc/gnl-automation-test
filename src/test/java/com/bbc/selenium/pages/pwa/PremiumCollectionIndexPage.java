package com.bbc.selenium.pages.pwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PremiumCollectionIndexPage {

    WebDriver driver;

    PWAIndexPage pwaIndexPage;

    public PremiumCollectionIndexPage(WebDriver driver) {
        this.driver = driver;
        pwaIndexPage = new PWAIndexPage(driver);
    }

    public String getLogoBorderColor() {
        String borderColour = pwaIndexPage.getLogo().findElement(By.cssSelector("h2")).getAttribute("style");
        borderColour = borderColour.replace("border-color: ", "");

        return borderColour.replace(";", "");
    }
}
