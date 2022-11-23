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


    @Given("The employee is on their custom page")
    public void the_employee_is_on_their_custom_page() {
        // go to login page, then log in
        TestRunner.driver.get("File://C:/Project2/Tech-Project-Java-Dumplings-/dumpling/src/test/resources/webpages/employee.html");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("The employee click on the toggle button")
    public void the_employee_click_on_the_toggle_button() {
        TestRunner.employee.toggleStatus();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
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

     
    }

    @When("The employee type in the reason")
    public void the_employee_type_in_the_reason() {
        By userMessageFieldLocator = By.id("description");
        WebElement userMessageField = TestRunner.driver.findElement(userMessageFieldLocator);
        userMessageField.sendKeys("Pizza Party!!!!");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
         }
    }    
       

    @When("The employee type in the amount of money")
    public void the_employee_type_in_the_amount_of_money() {
        By firstInputFieldLocator = By.id("moneyrequest");
        WebElement firstInputField = TestRunner.driver.findElement(firstInputFieldLocator);
        firstInputField.sendKeys("200");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    
        

    @When("The employee click on the submit button")
    public void the_employee_click_on_the_submit_button() {
        TestRunner.employee.submitRequest();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
            

    @Then("The employee should see a confirmation message")
    public void the_employee_should_see_a_confirmation_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("Request sent!", TestRunner.driver.switchTo().alert().getText());
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("The employee click on the sign out button")
    public void the_employee_click_on_the_sign_out_button() {
        TestRunner.employee.signOut();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }

    @Then("The employee should be send back to the login page")
    public void the_employee_should_be_send_back_to_the_login_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Identification"));
        String title = TestRunner.driver.getTitle();
      
        Assert.assertEquals("Identification", title);
      
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
    }
}

        
