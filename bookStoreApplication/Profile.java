package bookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profile {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    public Profile(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }

    By goToBookStoreBtn = By.xpath("//button[@id='gotoStore']");

    By deleteAccountBtn = By.xpath("//button[contains(text(),'Delete Account')]");

    By deleteAllBooksBtn = By.xpath("//button[contains(text(),'Delete All Books')]");

    By deleteOneBookBtn = By.id("delete-record-undefined");

    public WebElement getGoToBookStoreBtn(){
        return driver.findElement(goToBookStoreBtn);
    }
    public WebElement getDeleteAccountBtn(){
        return driver.findElement(deleteAccountBtn);
    }
    public WebElement getDeleteAllBookBtn(){
        return driver.findElement(deleteAllBooksBtn);
    }
    public WebElement getDeleteOneBookBtn(){
        return driver.findElement(deleteOneBookBtn);
    }
    public void clickGoToBookStoreBtn(){
        getGoToBookStoreBtn().click();
    }
    public void clickDeleteAccountBtn(){
        getDeleteAccountBtn().click();
    }
    public void clickDeleteAllBooks(){
        getDeleteAllBookBtn().click();
    }
    public void clickDeleteOneBook(){
        getDeleteOneBookBtn().click();
    }
}
