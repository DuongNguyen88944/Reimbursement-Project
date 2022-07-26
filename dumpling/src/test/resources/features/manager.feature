Feature: Manager should be able to view the reimbursement requests, accept/reject it and log out
    Scenario: As a Manager I want to view reimbursement requests
    Given The manager is on their custom page
    Then  The Manager should be able to view the requests

    Scenario: As a Manager I want to be able to reject the requests
    Given The request description is display
    When  The manager select a request id 
    When  The manager enter all the require informations
    When  The manager select the reject option
    When  The manager enter the reason
    When  The manger click the save button
    Then  The manager should see a reject confirmation message 

    Scenario: As a Manager I want to be able to accept the requests
    Given The requests table is display
    When  The manager select a request ID
    When  The manager enter all require informations
    When  The manager select the accept option
    When  The manager enter a reason
    When  The manger click on the save button
    Then  The manager should see a accept confirmation message 

    Scenario: As a manager I want to sign out of my custom homepages
    Given The manager is on the custom homepage
    When  The employee click the Logout button 
    Then  The manager should be transfer back to the login page