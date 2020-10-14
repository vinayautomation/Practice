Feature: PHP Travels Login feature

Scenario: Login with valid credentials

Given user is on valid login page
When user enters valid username and password
And click on login button
Then user logged in application successfully 
