package com.upgn.pages;

import com.upgn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "login")
    public WebElement emailInput;


    @FindBy(name = "password")
    public WebElement passwordInput;


    @FindBy (xpath = "//button[@type = 'submit']")
    public WebElement LogInButton;


    @FindBy (xpath = "//*[@id=\"wrapwrap\"]/main/div/form/p")
    public WebElement wrongLoginPasswordMessage;



}
