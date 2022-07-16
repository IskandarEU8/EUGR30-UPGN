package com.upgn.step_definitions.login;

import com.upgn.pages.LoginPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Login_enter_button_check_StepDefinition {


    LoginPage loginPage = new LoginPage();

    @When("User hits Enter button on email input")
    public void user_hits_enter_button_on_email_input() {
        loginPage.emailInput.sendKeys(Keys.ENTER);

    }
    @When("User hits Enter button on password input")
    public void user_hits_enter_button_on_password_input() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);

    }



}
