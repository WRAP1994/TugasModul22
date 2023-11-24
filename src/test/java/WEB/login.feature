@login
Feature: Test login suite

  @Login
  Scenario: Login with valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @lock-login-user
  Scenario: Login with invalid email and password
    Given user is on login page
    And user input username with "locked_out_user"
    And user input password with "invalid"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @problem-login
  Scenario: login using valid email and password
    Given user is on login page
    And user input username with "problem_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage see error catalog

  @Visual-login
  Scenario: login using valid email and password
    Given user is on login page
    And user input username with "visual_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage see error one picture catalog

  @Performance-glitch-user
  Scenario: Login with valid email and password
    Given user is on login page
    And user input username with "performance_glitch_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage