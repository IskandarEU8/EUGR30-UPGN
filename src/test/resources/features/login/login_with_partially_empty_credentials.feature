@UPGN-312 @login_functionality @UPGN-255  @empty_credentials

  Feature:  "Please fill out this field" message should be displayed if the password or username is empty

    Background: User is on the login page
      Given User is on the login page


      #While logging in user fills in login/email field but leaves password field empty and sees "Please fill out this field". message from password field.
    @UPGN-310
    Scenario: User inputs email but leaves empty password field
      When  User inputs valid email "salesmanager6@info.com"
      And Clicks Login button
      Then User sees "Please fill out this field." message from password input


      #While logging in user leaves login/email field empty, but types password and sees "Please fill out this field."
        # message from login/email input field.
    @UPGN-311
      Scenario: User leaves login input empty and inputs just a password
        And User inputs valid password "salesmanager"
        And Clicks Login button
        Then User sees "Please fill out this field." message from email input



