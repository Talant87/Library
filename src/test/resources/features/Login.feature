Feature: As a user I want to be able to login
  Scenario: Login as a student
    Given user on the login page
    When user logs in
    Then user should see library page