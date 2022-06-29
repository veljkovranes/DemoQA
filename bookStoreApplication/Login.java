package bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    WebDriver driver;
    Actions actions;
    WebDriverWait wdwait;

    By loginLink = By.id("item-0");
    By userName = By.id("userName");
    By password = By.id("password");
    By loginBtn = By.id("login");

    By logOutBtn = By.xpath("//button[contains(text(),'Log out')]");


    public Login(WebDriver driver, Actions actions, WebDriverWait wdwait) {
        this.driver = driver;
        this.actions = actions;
        this.wdwait = wdwait;
    }

    public Login() {

    }

    public WebElement getLoginLink(){
        return driver.findElement(loginLink);
    }
    public WebElement getUserName(){
        return driver.findElement(userName);
    }
    public WebElement getPassword(){
        return driver.findElement(password);
    }
    public WebElement getLoginBtn(){
        return driver.findElement(loginBtn);
    }
    public WebElement getLogOutBtn(){
        return driver.findElement(logOutBtn);
    }
    public void clickLoginLink(){
        getLoginLink().click();
    }
    public void addUserName(){
        getUserName().click();
    }
    public void addPassword(){
        getPassword().click();
    }
    public void clickLoginBtn(){
        getLoginBtn().click();
    }
    public void clickLogOutBtn(){
        getLogOutBtn().click();
    }

}
