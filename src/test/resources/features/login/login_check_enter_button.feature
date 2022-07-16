@login_functionality @UPGN-255  @enter_button_check

  Feature: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page

    Background: User is on the login page
      Given User is on the login page

    Scenario: When user hits Enter button Enter button acts as login button

    Scenario : User inputs valid credentials and logs in

      When User inputs valid email "salesmanager105@info.com"
      And User hits Enter button on email input
      And User inputs valid password "salesmanager"
      And User hits Enter button on password input
      Then User logs in and see the title "Odoo"

