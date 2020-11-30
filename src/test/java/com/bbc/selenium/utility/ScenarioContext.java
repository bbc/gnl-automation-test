package com.bbc.selenium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ScenarioContext {
    // instance of singleton class
    private static ScenarioContext scenarioContext;
    private WebDriver driver;

    public static ScenarioContext getInstanceOfScenarioContextClass() {
        if (scenarioContext == null) {
            scenarioContext = new ScenarioContext();
        }
        return scenarioContext;
    }

    public void startBrowser(String browser) {
        if (System.getProperty("env") == null) {
            System.setProperty("env", "test.");
        }

        if (System.getProperty("browser") != null) {
            browser = System.getProperty("browser");
        }

        switch (browser) {
            case "chrome":
                startChrome();
                break;
            case "edge":
                startEdge();
                break;
            default:
                startFirefox();
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    private void startFirefox() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
        this.driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    private void startChrome() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    private void startEdge() {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver");
        this.driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
