@login_functionality @UPGN-255 @invalid_credentials @UPGN-309

Feature: "Wrong login/password" should be displayed for invalid
  (valid username-invalid password and invalid username-valid password) credentials

  Background: User is on the login page
    Given User is on the login page

    #User should see "Wrong username/email" message when he inputs valid email and invalid password
  @UPGN-307
  Scenario: User inputs credentials (valid username/email and invalid password)
  and sees "Wrong login/password"

    When User inputs valid email "salesmanager10@info.com"
    And User inputs invalid password "sales_manager"
    And Clicks Login button
    Then User sees Wrong login-password message



    	#User should see "Wrong username/email" message when he inputs invalid email and valid password
  @UPGN-308
  Scenario: Scenario: User inputs credentials (invalid username/email
  and valid password) and sees "Wrong login/password"

    When User inputs invalid email "sales_manager10@info.com"
    And User inputs valid password "salesmanager"
    And Clicks Login button
    Then User sees Wrong login-password message