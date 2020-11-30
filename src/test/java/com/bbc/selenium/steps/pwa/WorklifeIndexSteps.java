package com.bbc.selenium.steps.pwa;

import com.bbc.selenium.pages.pwa.PWAIndexPage;
import com.bbc.selenium.pages.pwa.WorklifeIndexPage;
import com.bbc.selenium.utility.AssertUtility;
import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WorklifeIndexSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();
    AssertUtility assertUtility = new AssertUtility();

    WorklifeIndexPage worklifeIndexPage = new WorklifeIndexPage(scenarioContext.getDriver());

    @Given("^I navigate to the worklife index page$")
    public void navigateToWorklifeIndexPage() {
        scenarioContext.getDriver().get("https://" + System.getProperty("env") +  "bbc.com/worklife");
    }

    @Then("^the worklife navigation menu home link is visible and highlighted$")
    public void assertWorklifeMenuHomeLinkVisible() {
        Assert.assertTrue("Workilfe menu navigation home link was not visible in navigation menu", worklifeIndexPage.getWorklifeMenuHomeNavigationLink().isDisplayed());
        assertUtility.assertAttributeContains(worklifeIndexPage.getWorklifeMenuHomeNavigationLink(), "class", "nav-links__link--active");
    }

    @Then("^the worklife home link is visible$")
    public void assertWorklifeHomeLinkVisible() {
        Assert.assertTrue("Workilfe home link was not visible in navigation menu", worklifeIndexPage.getWorklifeHomeLink().isDisplayed());
    }
}
