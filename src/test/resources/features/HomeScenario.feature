Feature: This feature file will test cliking add to cart based on which title seleccted
  @Smoke
  Scenario: Verify User Can Place Order
    Given user open website
    When user do login
    Then verify user is on homepage
    When user click on add to cart button for item "Sauce Labs Onesie"