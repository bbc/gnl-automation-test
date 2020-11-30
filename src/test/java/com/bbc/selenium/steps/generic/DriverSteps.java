package com.bbc.selenium.steps.generic;

import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DriverSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();

    @Given("^I open a (.*) browser$")
    public void setup(String browser) {
        scenarioContext.startBrowser(browser);
    }

    @Then("^I close the browser$")
    public void teardown() {
        if (scenarioContext.getDriver() != null) {
            scenarioContext.getDriver().quit();
        }
    }
}
