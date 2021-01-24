package com.bitPanda.stepDefinitions;

import com.bitPanda.pages.SearchPage;
import com.bitPanda.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductStepDefs {

    SearchPage searchPage = new SearchPage();

    @When("the user search for product {string}")
    public void the_user_search_for_product(String product) {
        searchPage.searchBox.sendKeys(product);
        searchPage.searchButton.click();
    }

    @When("the user search for another product {string}")
    public void the_user_search_for_another_product(String product) {
        searchPage.continueShoppingButton.click();
        searchPage.searchBox.clear();

        searchPage.searchBox.sendKeys(product);
        searchPage.searchButton.click();
    }


    @When("the user add the product to card")
    public void the_user_add_the_product_to_card() {
        BrowserUtils.hover(searchPage.firstItem);

        searchPage.firstAddToCartButton.click();
    }

    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedMessage) {
        BrowserUtils.waitForVisibility(searchPage.successMessage,5);
        String actualMessage = searchPage.successMessage.getText();
        Assert.assertEquals("verify the message",expectedMessage,actualMessage);
    }


}
