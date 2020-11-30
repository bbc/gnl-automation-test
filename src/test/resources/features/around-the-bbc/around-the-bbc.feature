Feature: Around The BBC Tests

  Scenario: Check links in the Around The BBC section
    Given I open a firefox browser
    And I resize the window to 1280 x 1000
    And I navigate to the future index page
    When I scroll to the footer
    Then the around the bbc section is present
    And I check link 1 on the around the bbc module works correctly
    And I close the browser
