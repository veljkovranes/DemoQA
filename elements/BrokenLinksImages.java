package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    By brokenLinksLink = By.id("item-6");
    By validImage = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div:nth-child(2) > img:nth-child(2)");
    By brokenImage = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/img[2]");
    By validLink = By.linkText("Click Here for Valid Link");
    By invalidLink = By.linkText("Click Here for Broken Link");

    public BrokenLinksImages(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }
    public WebElement getBrokenLinksLink(){
        return driver.findElement(brokenLinksLink);
    }
    public WebElement getValidImage(){
        return driver.findElement(validImage);
    }
    public WebElement getBrokenImage(){
        return driver.findElement(brokenImage);
    }
    public WebElement getValdLink(){
        return driver.findElement(validLink);
    }
    public WebElement getInvalidLink(){
        return driver.findElement(invalidLink);
    }
    public boolean isValidImageDisplayed(){
        return getValidImage().isDisplayed();
    }
    public boolean isBrokenImageDisplayed(){
        return getBrokenImage().isDisplayed();
    }
    public void clickValidLink(){
        getValdLink().click();
    }
    public void clickInvalidLink(){
        getInvalidLink().click();
    }
}
