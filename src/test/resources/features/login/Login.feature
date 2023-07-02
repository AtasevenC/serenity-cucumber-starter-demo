 Feature: Login
  As a user
  I want to be able to log in to my account
  So that I can access my account information


  Scenario: Verify that the user can successfully Login
    Given I am on the login page
    When I enter "email" as a email
    And I user enter "password" as a password
    And I click the login button
    Then I should be logged in successfully