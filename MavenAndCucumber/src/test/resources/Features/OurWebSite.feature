@OurWebSite
Feature: Registration form fillup
  As a user he will able to Registration by using valid data

  Scenario Outline: User will able to Registration by using valid data
    Given user is on registration form web page
    When user will Enter "<FirstName>", "<LastName>","<Email>", "<AgEmail>","<Password>"
    And user will click on "<Sex>"
    And user will select "<Month>","<Day>", "<Year>"
    Then user will able to register successfully

    Examples: 
      | FirstName | LastName | Email             | AgEmail           | Password | Sex    | Month | Day | Year |
      | Farhana   | Zaman    | farhana@yahoo.com | farhana@yahoo.com | far7645  | Female | Jun   |  25 | 1987 |
      | Mohammed  | Islam    | islam@gmail.com   | islam@gmail.com   | islam423 | Male   | May   |  26 | 1975 |
      | Padma     | Khan     | padma@yahoo.com   | padma@yahoo.com   | padm1432 | Female | Feb   |  27 | 1985 |
      | Farhana   | Zaman    | farhana@yahoo.com | farhana@yahoo.com | far7645  | Female | Jun   |  28 | 1987 |
      | Mohammed  | Zahir    | islam@gmail.com   | islam@gmail.com   | islam423 | Male   | May   |  29 | 1975 |
      | Oyshi     | Khan     | padma@yahoo.com   | padma@yahoo.com   | padm1432 | Female | Feb   |  30 | 1985 |
