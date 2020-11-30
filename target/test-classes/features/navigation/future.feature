@Future @Desktop @PWA
Feature: Future Navigation

  Scenario: Large desktop resolution
    Given I open a firefox browser
    And I resize the window to 1280 x 1000
    And I navigate to the future index page
    When I close the domestic disclaimer
    Then the domestic disclaimer is closed
    When I close the privacy policy
    Then the privacy policy is closed

  Scenario: Check the branding navigation
    When I click the more navigation button
    Then the future navigation menu home link is visible and highlighted
    And 7 menu navigation links are visible
    When I click the close button
    Then navigation is closed
    And the logos colour is rgb(0, 40, 86)
    And 4 navigation links are visible

  Scenario: Check nav links are removed on resize
    Given I resize the window to 610 x 1000
    Then 1 navigation links are visible
    And the more button is visible
    And the more burger icon is visible

  Scenario: Mobile resolution
    Given I resize the window to 400 x 600
    Then the more button now says Menu
    And the more burger icon is visible
    And 0 navigation links are visible
    Then I close the browser
