#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


@tag
Feature: Coding challenge at Everest Engineering
  I want to use this template for my feature file
  
  Background: User navigates to application URL
  Given I am on the Login page url "http://swiggy.com"
  Then I should see the landing page

  @tag1
  Scenario: Title of your scenario
    Given I want to enter my delivery location as "Indiranagar"
    Then I should click on the search result whose text is "Indiranagar, Bengaluru, Karnataka, India"
    Then I should go to the restuarants page and verify the user navigated to "https://www.swiggy.com/bangalore/restaurants"
    Then click on the Search 
    And Search for Restaurant called "Bite Me" and Click on it
    Then Add a item to the cart "Red Velvet Cupcake" and quantity is "2"
    Then I like to add "Tiramisu Cupcake" with quantity is "2"
    Then include a item to the cart "Choco Cake Cupcake" having quantity as "1"
    Then I  add "Irish Coffee Cupcake" with quantity is "1"
    Then click on the checkout
    And Verify Items added in checkout page "https://www.swiggy.com/checkout"
    Then Click on "New to Swiggy? SIGN UP"
    And Add details Name As "abc abc"
    And Phone no as "0000000000"
    And Email as "abc@def.com"
    And Click "Have a referral code?"
    And Enter password as "123456"
    And Click on CONTINUE
    Then verify Error message at Email field "Invalid email address"
    And change the "Red Velvet Cupcake" to "1"
    
    
    
    
    
    
   

 
