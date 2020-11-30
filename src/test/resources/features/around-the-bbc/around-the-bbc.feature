Feature: Around The BBC Tests

  Scenario: Check links in the Around The BBC section
    Given I visit future
    And I set the view to DESKTOP
    When I scroll to the footer
    Then check the around the bbc section is present
    And I check link 1 on the around the bbc module works correctly
