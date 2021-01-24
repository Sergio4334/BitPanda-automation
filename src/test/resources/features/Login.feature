Feature: Login

  @smoke
  Scenario: Login with valid credentials
    Given the user is on the dashboard page
    When the user clicks sign-in button
    And the user enters valid sign-in credentials "email" "password"
    Then the user should be able to login