Feature: Login to webpage
  
  User with valid login credentials should be logged in successfully

  Scenario Outline: User should login to the webpage successfully
    Given User invokes URL
    When User enters valid "<username>" and "<password>"
    Then User should login to the web page without any issues
    

    Examples: 
      | username | password |
      | admin    | demo123  |
     # | admin    | demo1234 |
