package bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStore extends Login{
    WebDriverWait wdwait;
    WebDriver driver;
    Actions actions;

    By searchBox = By.id("searchBox");
    By backToBookStoreBtn = By.xpath("//button[contains(text(),'Back To Book Store')]')]");
    By addBookBtn = By.xpath("//button[contains(text(),'Add To Your Collection')]");

    public BookStore(WebDriverWait wdwait, WebDriver driver, Actions actions) {
        super();
        this.wdwait = wdwait;
        this.driver = driver;
        this.actions = actions;
    }
    public WebElement getSearchBox(){
        return driver.findElement(searchBox);
    }
    public WebElement getBackToStoreBtn(){
        return driver.findElement(backToBookStoreBtn);
    }
    public WebElement getAddBookBtn(){
        return driver.findElement(addBookBtn);
    }
    public void searchBoxInput(){
        getSearchBox().click();
    }
    public void clickBackToStoreBtn(){
        getBackToStoreBtn().click();
    }
    public void clickAddBookBtn(){
        getAddBookBtn().click();
    }

}
