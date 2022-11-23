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
    //accept
    @Given("The manager is on their custom page")
    public void the_manager_is_on_their_custom_page() {
        TestRunner.driver.get("File://C:/Project2/Tech-Project-Java-Dumplings-/dumpling/src/test/resources/webpages/manager.html");
    }

    @When("The manager select an request ID")
    public void the_manager_select_an_request_ID() {
        
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("idInput")));
        testerOption.selectByVisibleText("2");
    }
    
    @When("The manager select the accept option")
    public void the_manager_select_the_accept_option() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("optionsA/R")));
        testerOption.selectByVisibleText("Accept");
    }
    @When("The manager enter the accept reason")
    public void the_manager_enter_the_accept_reason() {
        TestRunner.manager.enterReason(" Accept Automation Reason");
    }
   
    @Then("The manager should see a accept confirmation message")
    public void the_manager_should_see_a_accept_confirmation_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Request Successfully Updated!", text);
        TestRunner.driver.switchTo().alert().accept();
    }


    // reject
    @Given("The manager select an ID")
    public void the_manager_select_an_ID() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("idInput")));
        testerOption.selectByVisibleText("3");
    }
    @When("The manager see the request table")
    public void the_manager_see_the_request_table() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("requestTable")));
    }
    @When("The manager select the reject option")
    public void the_manager_select_the_reject_option() {
        Select testerOption = new Select(TestRunner.driver.findElement(By.id("optionsA/R")));
        testerOption.selectByVisibleText("Reject");
    }
    @When("The manager enter the reject reason")
    public void the_manager_enter_the_reject_reason() {
        TestRunner.manager.enterReason("Reject Automation Reason");
    }
    @When("The manager click the save button")
    public void the_manager_click_the_save_button() {
        TestRunner.manager.clickSaveButton();
    }
    @Then("The manager should see a reject confirmation message")
    public void the_manager_should_see_a_reject_confirmation_message() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Request Successfully Updated!", text);
        TestRunner.driver.switchTo().alert().accept();
    }

    @When("The manager click on the sign out button")
    public void the_manager_click_on_the_sign_out_button() {
        TestRunner.manager.clickOutButton();
    }

    @Then("The manager should be send back to the login page")
    public void the_manager_should_be_send_back_to_the_login_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Identification"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Identification", title);
    }
}