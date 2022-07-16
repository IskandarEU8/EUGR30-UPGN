@login_functionality @UPGN-255  @password_bulletsign

Feature: User should see the password in bullet signs by default

  Background: User is on the login page
    Given User is on the login page

    Scenario: When user types password the password should be shown

      When User inputs valid password "salesmanager"
      Then Password is shown as a bullet sign