

package com.techproject.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techproject.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    
    private String ManagerUser ;
    private String Managerpwd ;
    private String EmployeeUser ;
    private String Employeepwd ;

    //public static WebDriverWait wait;

    public LoginSteps(){

        //  Initialize the test 
        this.ManagerUser = "Manager Automation";
        this.Managerpwd = "password" ;
        this.EmployeeUser = "Employee Automation";
        this.Employeepwd = "password";
    }

    @Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
       TestRunner.driver.get("File://C:/Project2/Tech-Project-Java-Dumplings-/dumpling/src/test/resources/webpages/Identification.html");
    }
        

    @When("The employee enters his correct username")
    public void the_employee_enters_his_correct_username() {
    TestRunner.login.enterUsername(EmployeeUser);
    }
        
        
    
    @When("The employee enters his correct password")
    public void the_employee_enters_his_correct_password() {
      TestRunner.login.enterPassword(Employeepwd);
    }
        

    @Then("The employee should be logged in to the employee home page")
    public void the_employee_should_be_logged_in_to_the_employee_home_page() {
       TestRunner.wait.until(ExpectedConditions.titleIs("Employee Page"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Employee Page", title);
    }     
        
       
        
    @When("The manager enters his correct username")
    public void the_manager_enters_his_correct_username() {
        TestRunner.login.enterUsername(ManagerUser);
    }
        
    @When("The manager enters his correct password")
    public void the_manager_enters_his_correct_password() {
        TestRunner.login.enterPassword(Managerpwd);
    }   
    
    @When("The employee click the Login button")
    public void the_employee_click_the_Login_button() {
        TestRunner.login.clickButton();
    }
        
    @Then("The manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Manager Page"));
        String title = TestRunner.driver.getTitle();
        //wait = new WebDriverWait(driver, 15);
        Assert.assertEquals("Manager Page", title);
    }    
    
        
        
        
        
     
       
        
    
    
    


}