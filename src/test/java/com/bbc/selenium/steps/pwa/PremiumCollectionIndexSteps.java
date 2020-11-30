package com.bbc.selenium.steps.pwa;

import com.bbc.selenium.pages.pwa.PWAIndexPage;
import com.bbc.selenium.pages.pwa.PremiumCollectionIndexPage;
import com.bbc.selenium.utility.AssertUtility;
import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PremiumCollectionIndexSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();
    AssertUtility assertUtility = new AssertUtility();

    PWAIndexPage PWAIndexPage = new PWAIndexPage(scenarioContext.getDriver());
    PremiumCollectionIndexPage premiumCollectionIndexPage = new PremiumCollectionIndexPage(scenarioContext.getDriver());

    @Given("^I navigate to the bright sparks 2 index page$")
    public void navigateToBrightSparks2IndexPage() {
        scenarioContext.getDriver().get("https://www." + System.getProperty("env") + "bbc.com/worklife/bright-sparks-2");
    }

    @Then("^the premium collection logo has the link (.*)$")
    public void assertPremiumCollectionLogo(String expectedLink) {
        String fullExpectedLink = "https://www." + System.getProperty("env") + "bbc.com/" + expectedLink;
        assertUtility.assertAttributeEquals(PWAIndexPage.getLogo(), "href", fullExpectedLink);
    }

    @Then("^the premium collection logo text is (.*)$")
    public void assertPremiumCollectionLogoText(String expectedText) {
        assertUtility.assertText(PWAIndexPage.getLogo(), expectedText);
    }

    @Then("^the premium collection logo border colour is (.*)$")
    public void assertPremiumCollectionLogoBorderColour(String expectedColour) {
        assertUtility.assertText(premiumCollectionIndexPage.getLogoBorderColor(), expectedColour);
    }
}
