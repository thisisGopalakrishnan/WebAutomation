
@tag2
 Feature: Login Functionality

  Scenario Outline: Verify login functionality with multiple users
    Given I am on the login page
    When I enter "<username>" and "<password>"
    And I click the login button
    And going to apply leave 
    Then I should be logged in as "<userType>"

    Examples:
      | username | password | userType |
      | Admin    | admin13  | regular  |
      | Admin    | admin23  | regular  |
      | Admin    | admin123  | regular  |
      
      
  

      

 