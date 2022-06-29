package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons{
    WebDriver driver;
    WebDriverWait wdwait;

    Actions actions;

    By buttonsPageLink = By.id("item-4");
    By doubleClick = By.id("doubleClickBtn");
    By rightClick = By.id("rightClickBtn");
    By click = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]");
    By doubleClickMessage = By.id("doubleClickMessage");
    By rightClickMessage = By.id("rightClickMessage");
    By dynamicClickMessage = By.id("dynamicClickMessage");

    public Buttons(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }
    public WebElement getButtonsPageLink(){
        return driver.findElement(buttonsPageLink);
    }
    public WebElement getDoubleClick(){
        return driver.findElement(doubleClick);
    }
    public WebElement getRightClick(){
        return driver.findElement(rightClick);
    }
    public WebElement getClick(){
        return driver.findElement(click);
    }
    public WebElement getDoubleMsg(){
        return driver.findElement(doubleClickMessage);
    }
    public WebElement getRightClickMsg(){
        return driver.findElement(rightClickMessage);
    }
    public WebElement getDynamicClickMessage(){
        return driver.findElement(dynamicClickMessage);
    }
    public void clickDoubleClick(){
        actions.doubleClick(getDoubleClick()).perform();
    }
    public void clickRightClick(){
        actions.contextClick(getRightClick()).perform();
    }
    public void click(){
        actions.click(getClick()).perform();
    }


}
