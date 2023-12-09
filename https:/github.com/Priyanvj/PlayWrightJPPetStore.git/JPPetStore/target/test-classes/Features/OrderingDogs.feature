@JPPestStore
Feature: Automating JP PetStore application

  @TC003
  Scenario: Login to the application and ordering items
    Given User launches the browser
    When user clicks on "Sign In" button
    Then assert that "Please enter your username and password." is displayed
    When user enters "JPAdmin" in to textbox "username"
   		And user enters "JPAdmin12#$" in to textbox "password"
    	And user clicks on "Login" button
    Then assert that "Welcome America!" is displayed
    When user clicks on "DOGS" product link where ID is "SidebarContent"
    Then assert that "Labrador Retriever" is displayed
    	And assert that "Dalmation" is displayed
    	And assert that "Bulldog" is displayed
    	And assert that "Poodle" is displayed
    	And assert that "Golden Retriever" is displayed
    When user clicks on "K9-CW-01" product
    	And user clicks on "Add to Cart" button with respect to itemID "EST-27"
    	And user enters "3" in to textbox "EST-27"
    	When user clicks on "CATS" product link where ID is "QuickLinks"
    		And assert that "Manx" is displayed
    	And assert that "Persian" is displayed
    	  When user clicks on "FL-DSH-01" product
    	  And user clicks on "Add to Cart" button with respect to itemID "EST-15"
    	And user enters "4" in to textbox "EST-15"
    	And user clicks on "Update Cart" button
    	And user clicks on "Proceed to Checkout" button
    	When user selects "order.cardType" from "American Express" dropdown
    	And user enters "1234 3421 5678 3434" in to textbox "order.creditCard"
    	And user enters "07/26" in to textbox "order.expiryDate"
    	And user clicks on "Continue" button
    Then assert that "Shipping Address" is displayed
    When user clicks on "Confirm" button
    Then assert that "Thank you, your order has been submitted." is displayed
