Feature: Marriot testcases

Scenario: TC1 jw marriot
Given initialize driver
And user clicks on brand button
Then user checks for jw marriot
And close browser

Scenario: TC3 member benefits
Given initialize driver
Then user click on member benefits button
And user verifies text 
And close browser

Scenario Outline: TC2 search for hotel
Given initialize driver
When user click on search and enter "<location>" to search
And click on search button
Then user checks for city validation
And close browser

Examples:
|location|
|hyderabad|

