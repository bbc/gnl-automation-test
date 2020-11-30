package com.bbc.selenium.pages.pwa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PWAIndexPage {

    WebDriver driver;

    private String moreButtonID = "open-nav";

    private String menuNavigationId = "nav-menu-links";

    private String menuNavigationPrefixLinkCSS = "#nav-menu-links > a:nth-child(";
    private String menuNavigationSuffixLinkCSS = ") > p";
    private String navigationCloseButtonId = "close-nav";

    private String logoCSS = "#root > div.StickyElement > div > nav > div > div > div.nav-build-bar__branding.nav-build-bar__branding--desktop > a";

    private String navigationPrefixLinkCSS = "#nav-build-bar__links > a:nth-child(";
    private String navigationSuffixLinkCSS = ") > p";

    private String moreBurgerIconCSS = "#open-nav > div.open-nav__icon";

    public PWAIndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertMenuNavigationLinksAreDisplayed(int numberOfLinks) {
        // Not including home
        for(int i = 2; i < numberOfLinks + 2; i++) {
            Assert.assertTrue(driver.findElement(By.cssSelector(menuNavigationPrefixLinkCSS + i + menuNavigationSuffixLinkCSS)).isDisplayed());
        }
    }

    public WebElement getMoreButton() {
        return driver.findElement(By.id(moreButtonID));
    }

    public WebElement getMoreBurgerIcon() {
        return driver.findElement(By.cssSelector(moreBurgerIconCSS));
    }

    public WebElement getNavigationCloseButton() {
        return driver.findElement(By.id(navigationCloseButtonId));
    }

    public WebElement getLogo() {
        return driver.findElement(By.cssSelector(logoCSS));
    }

    public WebElement getMenuNavigationContainer() {
        return driver.findElement(By.id(menuNavigationId));
    }

    public void assertMoreNavigationIsClosed() {
        try {
            Assert.assertFalse(getMenuNavigationContainer().isDisplayed());
        } catch(NoSuchElementException e) {
            // Test has passed
        }
    }

    public void assertNavigationLinksAreDisplayed(int numberOfLinks) {
        // Not including home
        for(int i = 2; i < numberOfLinks + 2; i++) {
            Assert.assertTrue(driver.findElement(By.cssSelector(navigationPrefixLinkCSS + i + navigationSuffixLinkCSS)).isDisplayed());
        }
    }
}
