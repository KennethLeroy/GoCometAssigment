Feature: Can the user view list of products
  The list of products on each page must be shown to the user

  Scenario: The user sees all products on the first page
    Given  The user is on the home page
    When The user navigates to the first panel
    Then The user sees products on the first panel

  Scenario: The user sees all products on the second page
    Given  The user is on the home page
    When The user navigates to the second panel
    Then The user sees products on the second panel

  Scenario: The user sees all phones
    When User clicks on Phones button
    Then User sees all phones listed

  Scenario: The user sees all laptops
    When User clicks on Laptop button
    Then User sees all laptops listed

  Scenario: The user sees all monitors
    When User clicks on Monitors button
    Then User sees all monitors listed
