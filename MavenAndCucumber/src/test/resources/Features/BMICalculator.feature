@BMI
Feature: BMI Calcuator
  As a user I want to calculator my BMI

  Scenario Outline: BMI calculation
    Given I am on BMI calculator web page
    When I enter my "<Height in Centimeters>" in height text field
    And I enter my "<Weight in Kilograms>" in weight text field
    And I click on Calculate Button
    Then I will see "<My BMI>" and "<Category>"

    Examples:
      | Height in Centimeters | Weight in Kilograms | My BMI | Category    |
      | 167                   | 65                  | 23.3   | Normal      |
      | 180                   | 40                  | 12.3   | Underweight |
      | 160                   | 45                  | 17.6   | Underweight |
      | 168                   | 70                  | 24.8   | Normal      |
      | 181                   | 89                  | 27.2   | Overweight  |
      | 178                   | 100                 | 31.6   | Obesity     |
