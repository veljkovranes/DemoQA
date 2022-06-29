package testBookStore;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
    @Test
    public void goToLoginPage() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/login");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }
    @Test
    public void fillLoginForm() throws InterruptedException {
        goToLoginPage();
        login.addUserName();
        actions.sendKeys("VeljkoITCB").perform();
        login.addPassword();
        actions.sendKeys("Veljko14^%").perform();
        login.clickLoginBtn();
        Thread.sleep(600);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }@Test
    public void clickLogOutBtn() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(600);
        login.clickLogOutBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }
}
