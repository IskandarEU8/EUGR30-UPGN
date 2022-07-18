@UPGN-316 @login_functionality @UPGN-255  @enter_button_check

Feature: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page

  Background: User is on the login page
    Given User is on the login page


      #When user inputs his valid credentials and instead of clicking on Sign In button hits Enter on a keyboard
        # he/she is able to log in
  @UPGN-315
  Scenario: When user hits Enter button Enter button acts as login button

    When User inputs valid email "salesmanager105@info.com"
    And User hits Enter button on email input
    And User inputs valid password "salesmanager"
    And User hits Enter button on password input
    Then User logs in and see the title "Odoo"

