package com.bitPanda.pages;

import com.bitPanda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "a.login")
    public WebElement commonSignInButton;

    @FindBy(css = "#contact-link>a")
    public WebElement contactUsButton;

    @FindBy(css = "#search_query_top")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@name='submit_search']")
    public WebElement searchButton;


}
