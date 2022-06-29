package elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {

    WebDriver driver;
    WebDriverWait wdwait;

    By yesRadio = By.cssSelector("label[for='yesRadio']");
    By impressiveRadio = By.cssSelector("label[for='impressiveRadio']");
    By noRadio = By.cssSelector("#noRadio");
    By radioMessageShown = By.className("mt-3");
    By radioMessageText = By.className("text-success");

    By radioButtonLink = By.id("item-2");

    public RadioButton(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getYesRadio(){
        return driver.findElement(yesRadio);
    }
    public WebElement getImpressiveRadio(){
        return driver.findElement(impressiveRadio);
    }
    public WebElement getNoRadio(){
        return driver.findElement(noRadio);
    }
    public WebElement getRadioMessageShown(){
        return driver.findElement(radioMessageShown);
    }
    public WebElement getRadioMessageText(){
        return driver.findElement(radioMessageText);
    }
    public WebElement getRadioButtonLink(){
        return driver.findElement(radioButtonLink);
    }
    public void clickYesRadio(){
        getYesRadio().click();
    }
    public void clickImpressiveRadio(){
        getImpressiveRadio().click();
    }
    public boolean isNoEnabled(){
        return  getNoRadio().isEnabled();
    }
    public String radioMessage(){
        return getRadioMessageShown().getText();
    }
    public String radioMessageText(){
        return getRadioMessageText().getText();
    }

}
