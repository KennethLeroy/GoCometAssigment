Feature: Can the user view product details of each product
  Details of each product must be shown to the user

  Scenario Outline: Can the user see details of each product
    Given  The user is on the home page
    When The user clicks on "<product1>"
    Then The user sees details of "<product1>"

    Examples:
    |product1| |product1|
    |product2| |product2|
    |product3| |product3|
    |product4| |product4|
    |product5| |product5|
    |product6| |product6|
    |product7| |product7|
    |product8| |product8|
    |product9| |product9|
    |product10| |product10|
    |product11| |product11|
    |product12| |product12|
    |product13| |product13|