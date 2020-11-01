Feature: Demo Online Shopping

  @OnlineShopping
  Scenario Outline: Customer navigation through product categories: Phones, Laptops and Monitors
    And launch Browser
    And Click on laptop Category
    And Select a laptop"Sony vaio i5"
    And Click on Add to cart
    And Accept pop up confirmation
    And Return to the homepage
    And Click on category type
    And Select a laptop"Dell i7 8gb"
    And Click on laptop Category
    And Accept pop up confirmation
    And Navigate to the cart
    And Delete item from the cart
    And Place order to purchase
    And Fill the form
    And Purchase the Items
    And Get the Purchase details
    And Validate The Purchase Amout
    And Finish the shopping