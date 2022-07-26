package com.techproject.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.techproject.Poms.Manager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/techproject/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})

public class TestRunner {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Manager manager;

    @BeforeClass public static void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webpages/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        manager = new Manager(driver);

    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }

























}
