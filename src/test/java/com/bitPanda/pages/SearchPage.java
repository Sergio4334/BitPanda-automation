package com.bitPanda.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(xpath = "(//div[@class='right-block'])[1]")
    public WebElement firstItem;

    @FindBy(xpath = "//div[@class='right-block'])")
    public List<WebElement> items;

    @FindBy(xpath = "(//a[@title='Add to cart'])[1]")
    public WebElement firstAddToCartButton;

    @FindBy(xpath = "//a[@title='Add to cart']")
    public List<WebElement> addToCartButtons;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement successMessage;

    @FindBy(xpath = "//span[@title='Continue shopping']")
    public WebElement continueShoppingButton;


}
