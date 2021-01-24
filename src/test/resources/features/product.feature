@smoke
Feature: Add product to cart

  Background:
    Given the user is logged in

  Scenario: add products to cart
    When the user search for product "dress"
    And the user add the product to card
    Then "Product successfully added to your shopping cart" message should be displayed
    When the user search for another product "blouse"
    And the user add the product to card
    Then "Product successfully added to your shopping cart" message should be displayed
    When the user search for another product "t-shirt"
    And the user add the product to card
    Then "Product successfully added to your shopping cart" message should be displayed


    


