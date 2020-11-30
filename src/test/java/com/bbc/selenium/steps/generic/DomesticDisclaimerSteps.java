package com.bbc.selenium.steps.generic;

import com.bbc.selenium.pages.generic.DomesticDisclaimerPage;
import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DomesticDisclaimerSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();

    DomesticDisclaimerPage domesticDisclaimerPage = new DomesticDisclaimerPage(scenarioContext.getDriver());

    @When("^I close the domestic disclaimer$")
    public void closeDomesticDisclaimer() {
        domesticDisclaimerPage.getCloseButton().click();
    }

    @Then("^the domestic disclaimer is closed$")
    public void assertDomesticDisclaimerClosed() {
        domesticDisclaimerPage.assertDomesticDisclaimerIsNotVisible();
    }
}
