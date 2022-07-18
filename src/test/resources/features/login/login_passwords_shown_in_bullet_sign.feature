@UPGN-314 @login_functionality @UPGN-255  @password_bulletsign

Feature: User should see the password in bullet signs by default

  Background: User is on the login page
    Given User is on the login page

    #User entered password should be shown in bullet sign (to be hidden)
  @UPGN-313
  Scenario: When user types password the password should be shown in bullet sign

    When User inputs valid password "salesmanager"
    Then Password is shown as a bullet sign