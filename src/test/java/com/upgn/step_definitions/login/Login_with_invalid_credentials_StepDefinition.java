package com.upgn.step_definitions.login;

import com.upgn.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_with_invalid_credentials_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @When("User inputs invalid email <{string}>")
    public void user_inputs_invalid_email(String email) {
       loginPage.emailInput.sendKeys(email);
    }
    @When("User inputs valid password <{string}>")
    public void user_inputs_valid_password(String password) {
        loginPage.passwordInput.sendKeys(password);
        loginPage.LogInButton.click();
    }


    @Then("User sees Wrong login-password message")
    public void userSeesWrongLoginPasswordMessage() {
        loginPage.wrongLoginPasswordMessage.isDisplayed();
    }
}
