package com.upgn.step_definitions.logout;

import com.upgn.pages.HomePage;
import com.upgn.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_user_stays_on_login_page_StepDefinition {


    HomePage homePage = new HomePage();
    @When("User clicks back button")
    public void user_clicks_back_button() {
        Driver.getDriver().navigate().back();

    }
    @Then("User still stays on login page")
    public void user_still_stays_on_login_page() {
        Assert.assertTrue(homePage.sessionExpiredMessage.isDisplayed());
    }


}
