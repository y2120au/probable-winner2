Feature: fature to test Login
  I want to use this template for my feature file
@SmokeReg
   Scenario: check login is successfully with valid creduntials
    Given user is on login page
    When user enter username and password
    And click on login button
    Then user is navigate to home page