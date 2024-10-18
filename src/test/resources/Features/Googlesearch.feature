Feature: feature to test google search functinoality

Scenario: Vaildate google search is working

Given browers is open
And user is on google search page
When user is on google search box
And hits enter
Then user is naviagate to search results