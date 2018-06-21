@FundTrasfer
Feature: Fund Transfer functionality
  As a user I want to transfer fund to my friends and family

  Scenario: Valid payee and Valid Amount
    Given I am on fund transfer web page
    When I enter valid payee "Jim" and valid amount "500"
    And I click on Transfer button
    Then I should get success message "$500 transferred successfully to Jim!!"

  Scenario: Valid payee and Invalid Amount
    Given I am on fund transfer web page
    When I enter valid payee "Jim" and invalid amount "6000"
    And I click on Transfer button
    Then I should get fail message "Transfer failed!! account cannot be overdrawn"

  Scenario: Invalid payee and Valid Amount
    Given I am on fund transfer web page
    When I enter invalid payee "John" and valid amount "500"
    And I click on Transfer button
    Then I should get fail message "Transfer failed!! 'John' is not approved. Please contact your branch"
