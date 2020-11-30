package com.bbc.selenium.utility;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertUtility {

    public String displayActualExpected(String actual, String expected) {
        return "\nText Mismatch\nActual: " + actual + "\nExpected: " + expected;
    }

    public String displayActualExpected(String attribute, String actual, String expected) {
        return "\nAttribute: " + attribute + "\n" + "Actual: " + actual + "\nExpected: " + expected;
    }

    public void assertAttributeEquals(WebElement element, String attribute, String expectedValue) {
        String actualValue = element.getAttribute(attribute);
        Assert.assertTrue(displayActualExpected(attribute, actualValue, expectedValue), actualValue.equals(expectedValue));
    }

    public void assertAttributeContains(WebElement element, String attribute, String expectedValue) {
        String actualValue = element.getAttribute(attribute);
        Assert.assertTrue(displayActualExpected(attribute, actualValue, expectedValue), actualValue.contains(expectedValue));
    }

    public void assertCSSValueEquals(WebElement element, String CSSValue, String expectedValue) {
        String actualValue = element.getCssValue(CSSValue);
        Assert.assertTrue(displayActualExpected(CSSValue, actualValue, expectedValue), actualValue.equals(expectedValue));
    }

    public void assertText(WebElement element, String expectedText) {
        String actualText = element.getText();
        Assert.assertTrue(displayActualExpected(actualText, expectedText), actualText.equals(expectedText));
    }

    public void assertText(String actualText, String expectedText) {
        Assert.assertTrue(displayActualExpected(actualText, expectedText), actualText.equals(expectedText));
    }
}
