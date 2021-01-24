package com.bitPanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "#SubmitCreate")
    public WebElement createAccountButton;

    @FindBy(id = "email_create")
    public WebElement emailBox;

    @FindBy(id = "email")
    public WebElement signEmailBox;

    @FindBy(css = "#passwd")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public WebElement signInButton;

}
