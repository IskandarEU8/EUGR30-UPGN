package com.upgn.step_definitions.logout;

import com.upgn.pages.HomePage;
import com.upgn.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_redirects_2_login_page_StepDefinition {

    HomePage homePage = new HomePage();


    @When("User clicks to account button")
    public void user_clicks_to_account_button() {
        homePage.accountButton.click();
    }

    @When("User clicks to logout button")
    public void user_clicks_to_logout_button() {
        homePage.logOutButton.click();
    }


    @Then("User is redirected to login page")
    public void userIsRedirectedToLoginPage() {
        String expectedTitleOfLoginPage = "Login | Best solution for startups";

        Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedTitleOfLoginPage));
    }
}
