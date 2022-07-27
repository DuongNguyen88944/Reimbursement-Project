package com.techproject.steps;

import com.techproject.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmployeeSteps {

    // @Given("The employee is on the custom homepage")
    // public void the_employee_is_on_the_custom_homepage() {
    // // Write code here that turns the phrase above into concrete actions
    // throw new io.cucumber.java.PendingException();
    // }
    private String EmployeeUser;
    private String Employeepwd;

    public EmployeeSteps() {
        this.EmployeeUser = "user";
        this.Employeepwd = "pwd";
    }

    @Given("The employee is on their custom page")
    public void the_employee_is_on_their_custom_page() {
        // go to login page, then log in
        TestRunner.driver.get(
                "File://C:/Users/Dulce/Desktop/Tech-Project-Java-Dumplings-/dumpling/src/test/resources/webpages/Identification.html");
        System.out.println("The employee enters his correct username");
        TestRunner.login.enterUsername(EmployeeUser);

        System.out.println("The employee enters his correct password");
        TestRunner.login.enterPassword(Employeepwd);

        TestRunner.login.clickButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("The employee click on the toggle button")
    public void the_employee_click_on_the_toggle_button() {
        TestRunner.employee.toggleStatus();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Then("The requests table should be display")
    public void the_requests_table_should_be_display() {
        // Check the text of each header
        String requestDescriptionHeaderText = TestRunner.employee.requestDescriptionHeader.getText();
        Assert.assertEquals("Request Description", requestDescriptionHeaderText);

        String requestAmountHeaderText = TestRunner.employee.requestAmountHeader.getText();
        Assert.assertEquals("Request Amount", requestAmountHeaderText);

        String requestStatusHeaderText = TestRunner.employee.requestStatusHeader.getText();
        Assert.assertEquals("Request Status", requestStatusHeaderText);

        String requestReasonHeaderText = TestRunner.employee.requestReasonHeader.getText();
        Assert.assertEquals("Manager Reason", requestReasonHeaderText);

        // Check the text in each cell in the first row
        // first cell
        // String firstRowDescriptionText =
        // TestRunner.employee.getFirstRowDescription();
        // Assert.assertEquals("soda and candy", firstRowDescriptionText);

        // Check the number of rows
        // int numberOfRows = TestRunner.employee.getNumberOfRows();
        // Assert.assertEquals(2, numberOfRows);

        // 1. Make sure headers are right (correct text in correct column, by ID)
        // 2. Make sure data in the first row is right:
        // #requestsTableBody tr:first-child td:nth-child(1)
        // #requestsTableBody tr:first-child td:nth-child(2)
        // etc...
        // Make sure the table has the right number of rows:
        // #requestsTableBody tr (check the size of the list of elements selected by
        // this selector)
    }

    @When("The employee type in the reason")
    public void the_employee_type_in_the_reason() {
        By userMessageFieldLocator = By.id("description");
        WebElement userMessageField = TestRunner.driver.findElement(userMessageFieldLocator);
        userMessageField.sendKeys("Pizza Party!!!!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("The employee type in the amount of money")
    public void the_employee_type_in_the_amount_of_money() {
        By firstInputFieldLocator = By.id("moneyrequest");
        WebElement firstInputField = TestRunner.driver.findElement(firstInputFieldLocator);
        firstInputField.sendKeys("200");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @When("The employee click on the submit button")
    public void the_employee_click_on_the_submit_button() {
        TestRunner.employee.submitRequest();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Then("The employee should see a confirmation message")
    public void the_employee_should_see_a_confirmation_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("Request sent!", TestRunner.driver.switchTo().alert().getText());
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("The employee click the Logout button")
    public void the_employee_click_the_Logout_button() {
       TestRunner.employee.signOut();
       try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    }

    @Then("The employee should be transfer back to the login page")
    public void the_employee_should_be_transfer_back_to_the_login_page() {
        
      
        TestRunner.wait.until(ExpectedConditions.titleIs("Identification"));
        String title = TestRunner.driver.getTitle();
        System.out.println("title :" + title );
        Assert.assertEquals("Identification", title);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
