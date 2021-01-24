package com.bitPanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

    @FindBy(css = "#id_gender1")
    public WebElement mrRadioButton;

    @FindBy(css = "#id_gender2")
    public WebElement mrsRadioButton;

    @FindBy(id = "customer_firstname")
    public WebElement firstNameBox;

    @FindBy(id = "customer_lastname")
    public WebElement lastNameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "passwd")
    public WebElement passwordBox;

    @FindBy(css = "#days")
    public WebElement dayDropDown;

    @FindBy(css = "#months")
    public WebElement monthDropDown;

    @FindBy(css = "#years")
    public WebElement yearDropDown;

    @FindBy(css = "#company")
    public WebElement companyBox;

    @FindBy(css = "#address1")
    public WebElement address1Box;

    @FindBy(css = "#address2")
    public WebElement address2Box;

    @FindBy(css = "city")
    public WebElement cityBox;

    @FindBy(css = "#id_state")
    public WebElement stateDropDown;

    @FindBy(css = "#postcode")
    public WebElement zipCode;

    @FindBy(css = "#id_country")
    public WebElement countryDropDown;

    @FindBy(id = "other")
    public WebElement additionalInformationBox;

    @FindBy(id = "phone")
    public WebElement HomePhone;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id = "alias")
    public WebElement futureReferenceAddress;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;



    public Select dayDropDownList(){
        return new Select(dayDropDown);
    }

    public Select monthDropDownList(){
        return new Select(monthDropDown);
    }

    public Select yearDropDownList(){
        return new Select(yearDropDown);
    }

    public Select stateDropDownList(){
        return new Select(stateDropDown);
    }

    public Select countryDropDownList(){
        return new Select(countryDropDown);
    }

}
