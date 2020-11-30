Feature: Around The BBC Tests

  Scenario: Check links in the Around The BBC section
    Given test I visit future
    And test I set the view to DESKTOP
    When test I scroll to the footer
    Then test check the around the bbc section is present
    And I check link 1 on the around the bbc module works correctly
