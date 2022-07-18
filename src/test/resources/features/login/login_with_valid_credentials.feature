@login_functionality @UPGN-255 @valid_credentials
@UPGN-306
Feature: Users can log in with valid credentials
  (We have 5 types of users but will test only 2 user: PosManager, SalesManager)

  Background: User is on the login page
    Given User is on the login page

  @UPGN-305
  Scenario Outline: User inputs valid credentials and logs in

    When User inputs valid email "<email>"
    And User inputs valid password "<password>"
    And Clicks Login button
    Then User logs in and see the title "Odoo"

    Examples:
      | email                    | password     |
      | salesmanager6@info.com   | salesmanager |
      | salesmanager105@info.com | salesmanager |
      | posmanager10@info.com    | posmanager   |
      | posmanager155@info.com   | posmanager   |


