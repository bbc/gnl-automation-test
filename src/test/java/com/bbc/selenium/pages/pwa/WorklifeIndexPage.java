package com.bbc.selenium.pages.pwa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WorklifeIndexPage {

    WebDriver driver;

    private String worklifeMenuHomeNavigationLinkCSS = "#nav-menu-links > a.nav-links__link.nav-links__link--menu.nav-links__link--menu-desktop.nav-links__link--active.nav-links__link--active--menu.nav-links__link--active--worklife";
    private String worklifeHomeLinkCSS = "#nav-build-bar__links > a.nav-links__link.nav-links__link--active.nav-links__link--active--worklife > p";

    public WorklifeIndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWorklifeMenuHomeNavigationLink() {
        return driver.findElement(By.cssSelector(worklifeMenuHomeNavigationLinkCSS));
    }

    public WebElement getWorklifeHomeLink() {
        return driver.findElement(By.cssSelector(worklifeHomeLinkCSS));
    }
}
