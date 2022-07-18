package com.upgn.pages;

import com.upgn.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[@class='dropdown-toggle']/span[@class='oe_topbar_name']")
    public WebElement accountButton;


    @FindBy (xpath = "//a[.='Log out']")
    public WebElement logOutButton;

    @FindBy (tagName = "h4")
    public WebElement sessionExpiredMessage;
}
