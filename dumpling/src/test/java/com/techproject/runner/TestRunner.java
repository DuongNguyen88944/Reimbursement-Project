package com.techproject.runner;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techproject.poms.Employee;
import com.techproject.poms.Login;
import com.techproject.poms.Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="classpath:features", glue="com/techproject/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})

public class TestRunner {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Manager manager;
    public static Login login;
    public static Employee employee;
    @BeforeClass public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        login = new Login(driver);
        manager = new Manager(driver);
        employee = new Employee(driver);
    }
        
    

    @AfterClass

    public static void teardown(){
        driver.quit();
    }


}
