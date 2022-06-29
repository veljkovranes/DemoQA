package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Links {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    public Links(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    By links = By.id("item-5");
    By simpleLink = By.id("simpleLink");
    By dynamicLink = By.id("dynamicLink");
    By created = By.id("created");
    By noContent = By.id("no-content");
    By moved = By.id("moved");
    By badRequest = By.id("bad-request");
    By unauthorized = By.id("unauthorized");
    By forbidden = By.id("forbidden");
    By invalidUrl = By.id("invalid-url");

    By linkResponse = By.cssSelector("#linkResponse");

    public WebElement getLinks(){
        return driver.findElement(links);
    }
    public WebElement getSimpleLink(){
        return driver.findElement(simpleLink);
    }
    public WebElement getDynamicLink(){
        return driver.findElement(dynamicLink);
    }
    public WebElement getCreated(){
        return driver.findElement(created);
    }
    public WebElement getNoContent(){
        return driver.findElement(noContent);
    }
    public WebElement getMoved(){
        return driver.findElement(moved);
    }
    public WebElement getBadRequest(){
        return driver.findElement(badRequest);
    }
    public WebElement getUnauthorized(){
        return driver.findElement(unauthorized);
    }
    public WebElement getForbidden(){
        return driver.findElement(forbidden);
    }
    public WebElement getInvalidUrl(){
        return driver.findElement(invalidUrl);
    }
    public WebElement getLinkResponse(){
        return driver.findElement(linkResponse);
    }
    public void clickSimpleLink(){
        getSimpleLink().click();
    }
    public void clickDynamicLink(){
        getDynamicLink().click();
    }
    public void clickCreated(){
        getCreated().click();
    }
    public void clickNoContent(){
        getNoContent().click();
    }
    public void clickMoved(){
        getMoved().click();
    }
    public void clickBadRequest(){
        getBadRequest().click();
    }
    public void clickUnauthorized(){
        getUnauthorized().click();
    }
    public void clickForbidden(){
        getForbidden().click();
    }
    public void clickInvalidUrl(){
        getInvalidUrl().click();
    }
}
