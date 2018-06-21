@XpathFile
Feature: Register form fill up
  As a user he wants to fillup register form in Xpath page

  @SignupOutline
  Scenario Outline: User will be able to fill up form using valid information
    Given User is on Xpath web page
    When User will enter and click and select "<Row_index>"
    And User will click on submit button
    Then User will fill up successfully

    Examples: 
      | Row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |
      |         6 |
      |         7 |
      |         8 |
      |         9 |
      |        10 |
