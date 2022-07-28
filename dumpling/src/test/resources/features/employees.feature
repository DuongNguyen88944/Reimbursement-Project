Feature: Employee should be able view and to create a reimbursement request than log out
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

    Scenario: As an employee I want to log out of my page
        Given The employee is on their custom page
        When  The employee click on the sign out button
        Then  The employee should be send back to the login page
