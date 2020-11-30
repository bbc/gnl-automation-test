package com.bbc.selenium.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/navigation",
        glue = "com.bbc.selenium.steps",
        plugin = {"de.monochromata.cucumber.report.PrettyReports:target/report"})

public class NavigationTest {
}
