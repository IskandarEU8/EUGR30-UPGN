package com.upgn.step_definitions.login;

import com.upgn.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_blank_credentials_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Then("User sees {string} message from password input")
    public void userSeesMessageFromPasswordInput(String message) {
        String actualMessage = loginPage.passwordInput.getAttribute("validationMessage");
        System.out.println("actualMessage = " + actualMessage);
        System.out.println("message = " + message);
        Assert.assertTrue(actualMessage.equals(message));
    }

    @Then("User sees {string} message from email input")
    public void userSeesMessageFromEmailInput(String message) {
        String actualMessage = loginPage.emailInput.getAttribute("validationMessage");
        Assert.assertTrue(actualMessage.equals(message));
//        System.out.println("actualMessage = " + actualMessage);
//        System.out.println("message = " + message);
    }
}
