@login_functionality @UPGN-255  @empty_credentials

  Feature:  "Please fill out this field" message should be displayed if the password or username is empty

    Background: User is on the login page
      Given User is on the login page


    Scenario: User inputs email but leaves empty password field
      When  User inputs valid email "salesmanager6@info.com"
      And Clicks Login button
      Then User sees "Please fill out this field." message from password input


      Scenario: User leaves login input empty and inputs just a password
        And User inputs valid password "salesmanager"
        And Clicks Login button
        Then User sees "Please fill out this field." message from email input



