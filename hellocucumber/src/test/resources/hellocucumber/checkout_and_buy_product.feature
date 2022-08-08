Feature: Can the user checkout items in the cart
  The user must be able to checkout items from the cart page

  Scenario: The user checks out products
    Given  The user is on the cart page
    When The user clicks on the place order button
    Then The order form gets displayed

  Scenario: The user places the order
    Given  The order form gets displayed
    When The user fills the form
    Then The purchase confirmation gets displayed

