package com.bbc.selenium.steps.aroundthebbc;

import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

public class AroundTheBBCSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();

    @Given("^I open a (.*) browser")
    public void openFirefox(String browser) {
        scenarioContext.startBrowser(browser);
    }

    @Given("I resize the window to (\\d+) x (\\d+)$")
    public void thisIsATest(int x, int y) {
        scenarioContext.getDriver().manage().window().setSize(new Dimension(x, y));
    }

    @Given("^I navigate to the future index page$")
    public void navigateToFutureIndexPage() {
        scenarioContext.getDriver().get("https://www.bbc.com/future");
    }

    @When("^I scroll to the footer$")
    public void scrollToFooter() {
        JavascriptExecutor js = (JavascriptExecutor) scenarioContext.getDriver();
        js.executeScript("window.scrollBy(0, 10000)");
    }

    @Then("^the around the bbc section is present$")
    public void assertSectionPresent() {
        Assert.assertTrue("Around the BBC section not visible", scenarioContext.getDriver().findElement(By.className("around-the-bbc-swimlane")).isDisplayed());
    }

    @Then("^I check link (.*) on the around the bbc module works correctly$")
    public void assertLinkWorks(int link) {
        scenarioContext.getDriver().findElement(By.className("around-the-bbc-swimlane"))
                .findElements(By.className("swimlane__item")).get(link - 1).click();
    }

    @Then("^I close the browser$")
    public void teardown() {
        if (scenarioContext.getDriver() != null) {
            scenarioContext.getDriver().quit();
        }
    }
}
