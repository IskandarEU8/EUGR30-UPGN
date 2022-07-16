package com.upgn.step_definitions.login;

import com.upgn.pages.LoginPage;
import com.upgn.utilities.ConfigurationReader;
import com.upgn.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_with_valid_credentials_StepDefinition {


    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("login_page_url"));
    }

    @When("User inputs valid email {string}")
    public void user_inputs_valid_email(String email) {
        loginPage.emailInput.sendKeys(email);
    }
    @When("User inputs valid password {string}")
    public void user_inputs_valid_password(String password) {
        loginPage.passwordInput.sendKeys(password);
    }



    @And("Clicks Login button")
    public void clickLoginButton() {
        loginPage.LogInButton.click();
    }


    @Then("User logs in and see the title {string}")
    public void user_logs_in_and_see_the_title(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }


}
