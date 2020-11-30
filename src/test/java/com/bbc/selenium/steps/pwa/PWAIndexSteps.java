package com.bbc.selenium.steps.pwa;

import com.bbc.selenium.pages.pwa.PWAIndexPage;
import com.bbc.selenium.utility.AssertUtility;
import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PWAIndexSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();
    AssertUtility assertUtility = new AssertUtility();

    PWAIndexPage PWAIndexPage = new PWAIndexPage(scenarioContext.getDriver());

    @When("^I click the more navigation button$")
    public void clickMoreNavigationButton() {
        PWAIndexPage.getMoreButton().click();
    }

    @Then("^navigation is closed$")
    public void assertNavigationClosed() {
        PWAIndexPage.assertMoreNavigationIsClosed();
    }

    @When("^I click the close button$")
    public void clickCloseButton() {
        PWAIndexPage.getNavigationCloseButton().click();
    }

    @Then("^(\\d+) menu navigation links are visible$")
    public void assertMenuNavigationLinksAreVisible(int numberOfLinks) {
        PWAIndexPage.assertMenuNavigationLinksAreDisplayed(numberOfLinks);
    }

    @Then("^the logos colour is (.*)$")
    public void assertLogoColour(String expectedColour) {
        assertUtility.assertCSSValueEquals(PWAIndexPage.getLogo(), "background-color", expectedColour);
    }

    @Then("^(\\d+) navigation links are visible$")
    public void assertNavigationLinksAreVisible(int numberOfLinks) {
        PWAIndexPage.assertNavigationLinksAreDisplayed(numberOfLinks);
    }

    @Then("^the more button is visible$")
    public void assertMoreButtonVisible() {
        Assert.assertTrue("More button not visible", PWAIndexPage.getMoreButton().isDisplayed());
    }

    @Then("^the more burger icon is visible$")
    public void assertMoreBurgerIconVisible() {
        Assert.assertTrue("More burger icon not visible", PWAIndexPage.getMoreBurgerIcon().isDisplayed());
    }

    @Then("^the more button now says (.*)$")
    public void assertMenuText(String expectedText) {
        assertUtility.assertText(PWAIndexPage.getMoreButton(), expectedText);
    }
}
