Feature: Can the user add and remove items to cart
  The user should be able to add items to their cart as well as remove items

  Scenario: The user adds a product to cart
    Given  The user is on the product page
    When The user clicks on the add to cart button
    Then The product gets added to their cart

  Scenario: The user removes a product from cart
    Given  The user is on the cart page
    When The user clicks on the delete button
    Then The product gets deleted from their cart