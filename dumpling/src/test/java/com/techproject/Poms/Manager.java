package com.techproject.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    public Manager(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "requestInput")
    public WebElement requestInput;

    @FindBy(id = "amountInput")
    public WebElement amountInput;

    @FindBy(id = "reasonInput")
    public WebElement reasonInput ;

    @FindBy(id = "saveButton")
    public WebElement saveButton;

    @FindBy(id = "outButton")
    public WebElement outButton;

    public void clickSaveButton(){
        this.saveButton.click();
    }

    public void clickOutButton(){
        this.outButton.click();
    }

    public void enterName(String name){
        this.nameInput.clear();
        this.nameInput.sendKeys(name);
    }

    public void enterRequest(String request){
        this.requestInput.clear();
        this.requestInput.sendKeys(request);
    }
    
    public void enterAmount(int i){
        this.amountInput.clear();
        this.amountInput.sendKeys(String.valueOf(i));
    }

    public void enterReason(String reason){
        this.reasonInput.clear();
        this.reasonInput.sendKeys(reason);
    }
}
