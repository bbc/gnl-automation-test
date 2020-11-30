package com.bbc.selenium.steps.generic;

import com.bbc.selenium.utility.ScenarioContext;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Dimension;

public class ReSizeWindowSteps {

    ScenarioContext scenarioContext = ScenarioContext.getInstanceOfScenarioContextClass();

    @Given("I resize the window to (\\d+) x (\\d+)$")
    public void thisIsATest(int x, int y) {
        scenarioContext.getDriver().manage().window().setSize(new Dimension(x, y));
    }
}
