package com.bbc.selenium.steps.pwa;

import com.bbc.selenium.pages.pwa.FutureIndexPage;
import com.bbc.selenium.utility.AssertUtility;
import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FutureIndexSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();
    AssertUtility assertUtility = new AssertUtility();

    FutureIndexPage futureIndexPage = new FutureIndexPage(scenarioContext.getDriver());

    @Given("^I navigate to the future index page$")
    public void navigateToFutureIndexPage() {
        scenarioContext.getDriver().get("https://" + System.getProperty("env") + "bbc.com/future");
    }

    @Then("^the future navigation menu home link is visible and highlighted$")
    public void assertFutureMenuHomeLinkVisible() {
        Assert.assertTrue("Future menu navigation home link was not visible in navigation menu", futureIndexPage.getFutureMenuHomeNavigationLink().isDisplayed());
        assertUtility.assertAttributeContains(futureIndexPage.getFutureMenuHomeNavigationLink(), "class", "nav-links__link--active");
    }

    @Then("^the future home link is visible$")
    public void assertFutureHomeLinkVisible() {
        Assert.assertTrue("Future home link was not visible in navigation menu", futureIndexPage.getFutureHomeLink().isDisplayed());
    }
}
