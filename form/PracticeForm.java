package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeForm {
    WebDriver driver;
    WebDriverWait wdwait;
    Actions actions;

    public PracticeForm(WebDriver driver, WebDriverWait wdwait, Actions actions) {
        this.driver = driver;
        this.wdwait = wdwait;
        this.actions = actions;
    }
    By practiceFormLink = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By userNumber = By.id("userNumber");
    By dateOfBirthInput = By.id("dateOfBirthInput");
    By currentAddress = By.xpath("//textarea[@id='currentAddress']");

    By subject = By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper:nth-child(2) div.mt-2.row:nth-child(6) div.col-md-9.col-sm-12 div.css-2b097c-container div.subjects-auto-complete__control.css-yk16xz-control > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3");
    public WebElement getPracticeFormLink(){
        return driver.findElement(practiceFormLink);
    }
    public WebElement getFirstName(){
        return driver.findElement(firstName);
    }
    public WebElement getLastName(){
        return driver.findElement(lastName);
    }
    public WebElement getUserEmail(){
        return driver.findElement(userEmail);
    }
    public WebElement getUserNumber(){
        return driver.findElement(userNumber);
    }
    public WebElement getDateOfBirth(){
        return driver.findElement(dateOfBirthInput);
    }
    public WebElement getCurrentAddress(){
        return driver.findElement(currentAddress);
    }
    public WebElement getSubject(){
        return driver.findElement(subject);
    }
    public void clickPracticeForm(){
        getPracticeFormLink().click();
    }
    public void setFirstName(){
        getFirstName().click();
    }
    public void setLastName(){
        getLastName().click();
    }
    public void setEmail(){
        getUserEmail().click();
    }
    public void setUserNumber(){
        getUserNumber().click();
    }
    public void setDateOfBirth(){
        getDateOfBirth().click();
    }
    public void setCurrentAddress(){
        getCurrentAddress().click();
    }
    public void setSubject(){
        getSubject().click();
    }
}
