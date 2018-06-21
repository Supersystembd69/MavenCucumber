@Facebook
Feature: Facebook Account Signup

  Scenario Outline: User will be able to create new account using valid data
    Given User is on facebook signup page
    When User will enter "<FirstName>" ,"<LastName>" ,  "<EmailAddress>" , "<AgEmailAddress>", "<Password>"
    And user will select "<Month>" , "<Day>" , "<Year>"
    And user will click on Male Radio button
    And user will click on submit button
    Then user will create new account successfully

    Examples: 
      | FirstName | LastName | EmailAddress    | AgEmailAddress  | Password | Month | Day | Year |
      | Mohammed  | Zahir    | zahir@yahoo.com | zahir@yahoo.com | 76zahir  | May   | 1   | 1970 |
      | Jahangir  | Alam     | ambia@yahoo.com | ambia@yahoo.com | nurul321 | Jun   | 15  | 1965 |
      | Mohammed  | Habib    | shoub@yahoo.com | shoub@yahoo.com | habib321 | Jul   | 17  | 1979 |
      | Firoz     | Ahmed    | kabir@yahoo.com | kabir@yahoo.com | firoz321 | Aug   | 16  | 1972 |
