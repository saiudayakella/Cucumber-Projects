Feature: Login to webpage
  
  User with valid login credentials should be logged in successfully
  
  Background:
  Given User invokes URL
  
  Scenario Outline: User should login to the webpage successfully
   User enters "<username>" and "<password>" in the login page
    When Login Credentials are authorized
    Then Dashboard page is displayed
    
  Examples:
  |username|password|
  |admin|demo123|
  |admin|demo1234|
  
  
    



