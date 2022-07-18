@UPGN-318 @UPGN-255 @logout_functionality

Feature: User can log out and ends up in login page.

  Background: User is on the login page
    Given User is on the login page
    When User inputs valid email "salesmanager6@info.com"
    And User inputs valid password "salesmanager"
    And Clicks Login button

    #User can log out and ends up in login page.
  @UPGN-317
  @redirected_to_login_page
  Scenario: User clicks to account button then to logout button than ends up in login page
    When User clicks to account button
    And User clicks to logout button
    Then User is redirected to login page


    #The user can not go to the home page again by clicking the step back
	#button after successfully logged out.
  @UPGN-319
  @stays_on_login_page
  Scenario: The user can not go to the home page again by clicking the step back
  button after successfully logged out.

    When User clicks to account button
    And User clicks to logout button
    And User is redirected to login page
    When User clicks back button
    Then User still stays on login page
