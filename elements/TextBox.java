package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TextBox {

    public final String url = "https://demoqa.com/text-box";
    public WebDriver driver;
    public WebDriverWait wdwait;

    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");
    By textBoxLink = By.id("item-0");

    public TextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBoxLink(){
        return driver.findElement(textBoxLink);
    }
    public WebElement getFullName(){
        return driver.findElement(fullName);
    }
    public WebElement getEmail(){
        return driver.findElement(email);
    }
    public WebElement getCurrentAddress(){
        return driver.findElement(currentAddress);
    }
    public WebElement getPermanentAddress(){
        return driver.findElement(permanentAddress);
    }
    public WebElement getSubmitButton(){
        return driver.findElement(submit);
    }
    public void addFullName(String fullName){
        getFullName().sendKeys(fullName);
    }
    public void addEmail(String email){
        getEmail().sendKeys(email);
    }
    public void addCurrentAddress(String currentAddress){
        getCurrentAddress().sendKeys(currentAddress);
    }
    public void addPermanentAddress(String permanentAddress){
        getPermanentAddress().sendKeys(permanentAddress);
    }
    public void clickSubmitButton(){
        getSubmitButton().click();
    }
}
