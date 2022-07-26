package com.techproject.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.techproject.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {

    @Given("The manager is on their custom page")
    public void the_manager_is_on_their_custom_page() {
        TestRunner.driver.get("File://C:/Users/duong/Desktop/Tech-Project-Java-Dumplings-/dumpling/src/test/resources/webpages/manager.html");
    }
    
    @Then("The Manager should be able to view the requests")
    public void the_Manager_should_be_able_to_view_the_requests() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("requestTable")));
    }

//Accept
    @Given("The requests table is display")
    public void the_requests_table_is_display() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("requestTable")));
    }

    @When("The manager select a request ID")
    public void the_manager_select_a_request_ID() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("idInput")));
        testerOption.selectByVisibleText("18");
    }
    @When("The manager enter all require informations")
    public void the_manager_enter_all_require_informations() {
        TestRunner.manager.enterName("Automation Testing");
        TestRunner.manager.enterRequest("Request Description");
        TestRunner.manager.enterAmount(500);
    }
    @When("The manager select the accept option")
    public void the_manager_select_the_accept_option() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("optionsA/R")));
        testerOption.selectByVisibleText("Accept");
    }
    @When("The manager enter a reason")
    public void the_manager_enter_a_reason() {
        TestRunner.manager.enterReason(" Accept Automation Reason");
    }
    @When("The manger click on the save button")
    public void the_manger_click_on_the_save_button() {
        TestRunner.manager.clickSaveButton();
    }
    @Then("The manager should see a accept confirmation message")
    public void the_manager_should_see_a_accept_confirmation_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Request Successfully Updated!", text);
        TestRunner.driver.switchTo().alert().accept();
    }

// Reject

    @Given("The request description is display")
    public void the_request_description_is_display() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("requestTable")));
    }

    @When("The manager select a request id")
    public void the_manager_select_a_request_id() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("idInput")));
        testerOption.selectByVisibleText("19");
    }

    @When("The manager enter all the require informations")
    public void the_manager_enter_all_the_require_informations() {
        TestRunner.manager.enterName("Create Request Employee");
        TestRunner.manager.enterRequest("Testing Fees");
        TestRunner.manager.enterAmount(400);
    }

    @When("The manager select the reject option")
    public void the_manager_select_the_reject_option() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("optionsA/R")));
        testerOption.selectByVisibleText("Reject");
    }

    @When("The manager enter the reason")
    public void the_manager_enter_the_reason() {
        TestRunner.manager.enterReason("Reject Automation Reason");
    }

    @When("The manger click the save button")
    public void the_manger_click_the_save_button() {
        TestRunner.manager.clickSaveButton();
    }

    @Then("The manager should see a reject confirmation message")
    public void the_manager_should_see_a_reject_confirmation_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Request Successfully Updated!", text);
        TestRunner.driver.switchTo().alert().accept();
    }

// Log out
    @Given("The manager is on the custom homepage")
    public void the_manager_is_on_the_custom_homepage() {
        TestRunner.driver.get("File://C:/Users/duong/Desktop/Tech-Project-Java-Dumplings-/dumpling/src/test/resources/webpages/manager.html");
    }

    @When("The employee click the Logout button")
    public void the_employee_click_the_Logout_button() {
        TestRunner.manager.clickOutButton();
    }
    
    @Then("The manager should be transfer back to the login page")
    public void the_manager_should_be_transfer_back_to_the_login_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Login Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Login Page", title);
    }
}
