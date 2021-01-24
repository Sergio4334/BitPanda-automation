package com.bitPanda.stepDefinitions;

import com.bitPanda.pages.DashboardPage;
import com.bitPanda.pages.LoginPage;
import com.bitPanda.utilities.ConfigurationReader;
import com.bitPanda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the dashboard page")
    public void the_user_is_on_the_dashboard_page() {
        String expectedTitle = "My Store";
        String actualTitle = Driver.get().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("the user clicks sign-in button")
    public void the_user_clicks_sign_in_button() {

        new DashboardPage().commonSignInButton.click();
    }

    @When("the user enters valid sign-in credentials {string} {string}")
    public void the_user_enters_valid_sign_in_credentials(String email, String password) {
        LoginPage loginPage= new LoginPage();

        loginPage.signEmailBox.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));

        loginPage.signInButton.click();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "My account - My Store";

        Assert.assertEquals("verify the title",expectedTitle,actualTitle);
    }

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        new DashboardPage().commonSignInButton.click();

        LoginPage loginPage= new LoginPage();
        loginPage.signEmailBox.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginPage.signInButton.click();

    }

}
