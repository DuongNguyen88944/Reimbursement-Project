Feature: Users of my application should be able to login and logout of their respective homepages
   Scenario: As a manager I want to sign in so I can view my custom homepages
    Given The employee is on the login page
    When  The manager enters his correct username
    When  The manager enters his correct password
    When  The employee click the Login button 
    Then  The manager should be logged in to the manager home page 
  
   Scenario: As a employee I want to sign in so I can view my custom homepages
    Given The employee is on the login page
    When  The employee enters his correct username
    When  The employee enters his correct password
    When  The employee click the Login button 
    Then  The employee should be logged in to the employee home page 