Feature: Manager should be able to view the reimbursement requests, accept/reject it and log out
    Scenario: As a Manager I want to be able to view and accept the requests
    Given The manager is on their custom page
    When  The manager select an request ID
    When  The manager see the request table
    When  The manager select the accept option
    When  The manager enter the accept reason
    When  The manager click the save button
    Then  The manager should see a accept confirmation message 

    Scenario: As a Manager I want to be able to view and reject the requests
    Given The manager select an ID
    When  The manager see the request table
    When  The manager select the reject option
    When  The manager enter the reject reason
    When  The manager click the save button
    Then  The manager should see a reject confirmation message 

    

    # Scenario: As a manager I want to sign out of my custom homepages
    # Given The manager is on the custom homepage
    # When  The employee click the Logout button 
    # Then  The manager should be transfer back to the login page