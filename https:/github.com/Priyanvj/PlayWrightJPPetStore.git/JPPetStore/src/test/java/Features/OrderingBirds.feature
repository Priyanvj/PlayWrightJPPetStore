@JPPestStore
Feature: Automating JP PetStore application

  @TC002
  Scenario: Login to the application and ordering items
    Given User launches the browser
    When user clicks on "Sign In" button
    Then assert that "Please enter your username and password." is displayed
    When user enters "JPAdmin" in to textbox "username"
   		And user enters "JPAdmin12#$" in to textbox "password"
    	And user clicks on "Login" button
    Then assert that "Welcome America!" is displayed
    When user clicks on "Birds" product link where ID is "SidebarContent"
    Then assert that "Amazon Parrot" is displayed
    	And assert that "Finch" is displayed
    When user clicks on "FI-SW-01" product
    	And user clicks on "Add to Cart" button with respect to itemID "EST-1"
    	And user enters "3" in to textbox "EST-1"
    	And user clicks on "Update Cart" button
    	And user clicks on "Proceed to Checkout" button
    	And user enters "1234 3421 5678 3434" in to textbox "order.creditCard"
    	And user enters "07/26" in to textbox "order.expiryDate"
    	And user clicks on "Continue" button
    Then assert that "Shipping Address" is displayed
    When user clicks on "Confirm" button
    Then assert that "Thank you, your order has been submitted." is displayed
