package com.bbc.selenium.steps.generic;

import com.bbc.selenium.pages.generic.PrivacyPolicyPage;
import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrivacyPolicySteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();

    PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(scenarioContext.getDriver());

    @When("^I close the privacy policy$")
    public void closeDomesticDisclaimer() {
        privacyPolicyPage.getCloseButton().click();
    }

    @Then("^the privacy policy is closed$")
    public void assertDomesticDisclaimerClosed() {
        privacyPolicyPage.assertPrivacyPolicyIsNotVisible();
    }
}
