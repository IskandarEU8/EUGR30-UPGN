@login_functionality @UPGN-255 @invalid_credentials

Feature: "Wrong login/password" should be displayed for invalid
  (valid username-invalid password and invalid username-valid password) credentials

  Background: User is on the login page
    Given User is on the login page

  Scenario Outline: User inputs (valid username/email and invalid password and invalid
  username/email and valid password) credentials and sees "Wrong login/password"
    When User inputs invalid email <"email">
    And User inputs valid password <"password">
    And Clicks Login button
    Then User sees Wrong login-password message

    Examples: |email|password|
      | email                    | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager105@info.com | salesmanager |
      | posmanager10@info.com    | posmanager   |
      | posmanager155@info.com   | posmanager   |
