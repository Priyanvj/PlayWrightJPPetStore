@JPPestStore
Feature: Automating JP PetStore application

  @TC001
  Scenario: Login to the application and ordering items
    Given User launches the browser
    When user clicks on "Sign In" button
    Then assert that "Please enter your username and password." is displayed
    When user enters "JPAdmin" in to textbox "username"
    When user enters "JPAdmin12#$" in to textbox "password"
    When user clicks on "Login" button
    Then assert that "Welcome America!" is displayed
    When user clicks on "FISH" product link where ID is "SidebarContent"
    Then assert that "Angelfish" is displayed
    Then assert that "Tiger Shark!" is displayed
    Then assert that "Koi" is displayed
    Then assert that "Goldfish" is displayed
    When user clicks on "FI-SW-01" product
    When user clicks on "Add to Cart" button with respect to itemID "EST-1"
    When user enters "3" in to textbox "EST-1"
    When user clicks on "Update Cart" button
    When user clicks on "Proceed to Checkout" button
    When user enters "1234 3421 5678 3434" in to textbox "order.creditCard"
    When user enters "07/26" in to textbox "order.expiryDate"
    When user clicks on "Continue" button
    Then assert that "Shipping Address" is displayed
    When user clicks on "Confirm" button
    Then assert that "Thank you, your order has been submitted." is displayed
