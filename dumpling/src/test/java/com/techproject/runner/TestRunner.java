package com.techproject.runner;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techproject.poms.Login;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue = "com/techproject/steps")
public class TestRunner {
    
   
    public static WebDriver driver;
    //public static WebDriver driver2;
    //public static WebDriver driver3;
    public static Login login;
    
    public static WebDriverWait wait;

    @BeforeClass // this makes the method execute before all the steps
    public static void setup(){
        // make sure to set the value for the key as the full relative path to the chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        // the WebDriverWait is used to tell Selenium to wait up to a set amount of time for a given condition
        wait = new WebDriverWait(driver, 15);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       // wait = new WebDriverWait(driver3, 5);
       // driver3.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }

    
}
