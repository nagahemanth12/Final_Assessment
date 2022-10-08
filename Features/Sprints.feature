Feature: Checking the functionality of the Orange_HRM

Scenario: So validate the functionality of the login page.

Given the user enters the browser
Given user enters user name and password
Then home page is displayed

Scenario: Applying leave

Given Click on the Leave element
Then Click on Apply option
Then Select leave type
Then Select the dates 
Then mention the reason
Then Click on the Apply Button

Scenario: Search function of employee details with method overloading

Given Click on the admin element
Then Give the search inputs
