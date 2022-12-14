Feature: Login Page Feature

Scenario: Login Page Title
Given user is on login page
When user gets the title of the page
Then page title must be "OrangeHRM"

Scenario: Forgot Password
Given user is on login page
Then user must be able to view forgot your password link

Scenario: Login with valid credentials
Given user is on login page
When user enters username as "Admin"
And user enters password as "admin123"
And user clicks on Login button
Then user gets the title of the home page
And page title must be "OrangeHRM"
