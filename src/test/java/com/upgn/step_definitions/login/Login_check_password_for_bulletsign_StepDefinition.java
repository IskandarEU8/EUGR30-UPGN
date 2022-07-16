package com.upgn.step_definitions.login;

import com.upgn.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_check_password_for_bulletsign_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Then("Password is shown as a bullet sign")
    public void password_is_shown_as_a_bullet_sign() {
        Assert.assertTrue(loginPage.passwordInput.getAttribute("type").equals("password"));
    }


}
