package com.bbc.selenium.pages.pwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FutureIndexPage {

    WebDriver driver;

    private String futureMenuHomeNavigationLinkCSS = "#nav-menu-links > a.nav-links__link.nav-links__link--menu.nav-links__link--menu-desktop.nav-links__link--active.nav-links__link--active--menu.nav-links__link--active--future";
    private String futureHomeLinkCSS = "#nav-build-bar__links > a.nav-links__link.nav-links__link--active.nav-links__link--active--future > p";

    public FutureIndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFutureMenuHomeNavigationLink() {
        return driver.findElement(By.cssSelector(futureMenuHomeNavigationLinkCSS));
    }

    public WebElement getFutureHomeLink() {
        return driver.findElement(By.cssSelector(futureHomeLinkCSS));
    }
}
