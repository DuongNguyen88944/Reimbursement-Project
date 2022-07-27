package com.techproject.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.openqa.selenium.By;

public class Employee {
    private WebDriver driver; // this driver will only be used internally (in the class) so it is private

    public Employee(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; // this initializes the private driver field
    }

    @FindBy(id = "hidebutton")
    public WebElement toggleButton;

    @FindBy(id = "outButton")
    public WebElement signOutButton;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "requestDescriptionHeader")
    public WebElement requestDescriptionHeader;

    @FindBy(id = "requestAmountHeader")
    public WebElement requestAmountHeader;

    @FindBy(id = "requestStatusHeader")
    public WebElement requestStatusHeader;

    @FindBy(id = "requestReasonHeader")
    public WebElement requestReasonHeader;

    @FindBy(id = "moneyrequest")
    public WebElement moneyInput;

    // @FindBy(id = "#requestsTableBody tr:first-child td:nth-child(2)")
    // public WebElement firstRowAmount;

    // @FindBy(id = "#requestsTableBody tr:first-child td:nth-child(3)")
    // public WebElement firstRowStatus;

    // @FindBy(id = "#requestsTableBody tr:first-child td:nth-child(4)")
    // public WebElement firstRowReason;

    public String getFirstRowDescription() {
        WebElement firstRowDescription = driver
                .findElement(By.cssSelector("#requestsTableBody tr:first-child td:nth-child(1)"));
        return firstRowDescription.getText();
    }

    public int getNumberOfRows() {
        List<WebElement> firstRowDescription = driver.findElements(By.cssSelector("#requestsTableBody tr"));
        return firstRowDescription.size();
    }

    public void toggleStatus() {
        this.toggleButton.click();
    }

    public void submitRequest() {
        this.submitButton.click();
    }

    public void signOut(){
        this.signOutButton.click();
    }
}
