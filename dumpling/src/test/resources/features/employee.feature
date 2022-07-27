Feature: Employee should be able view and to create a reimbursement request
    Scenario: As an employee I want to view all the requests
        Given The employee is on their custom page
        When   The employee click on the toggle button
        Then   The requests table should be display

    Scenario: As an employee I want to be able to create a reimbursement request
        Given The employee is on their custom page
        When  The employee type in the reason
        When  The employee type in the amount of money
        When  The employee click on the submit button
        Then  The employee should see a confirmation message



    Scenario: As a employee I want to sign out of my custom homepages
        Given The employee is on their custom page
        When  The employee click the Logout button
        Then  The employee should be transfer back to the login page