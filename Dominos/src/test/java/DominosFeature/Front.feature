Feature: To add and remove the pizza
Scenario: Homepage
Given Url
 When  User clicks order online now button
    And  User enter the address and click first suggestion
    And  User clicks the VEG PIZZA MENU
    And  User clicks the BEVERAGES MENU
    And  User removes some products from the addtocart
    Then  User clicks check out button