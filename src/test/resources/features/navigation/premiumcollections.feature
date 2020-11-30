@PremiumCollections @Desktop @PWA
Feature: Premium Collections Navigation

  Scenario: Branding is changed correctly
    Given I open a firefox browser
    And I navigate to the bright sparks 2 index page
    When I close the domestic disclaimer
    Then the domestic disclaimer is closed
    And the premium collection logo has the link worklife/bright-sparks-3
    And the premium collection logo text is Bright Sparks 2
    And the premium collection logo border colour is rgb(232, 74, 23)
    And I close the browser
