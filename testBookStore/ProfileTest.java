package testBookStore;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BasePage {
    @Test
    public void goToLoginPage() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/login");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/login");
    }

    @Test
    public void fillLoginForm() throws InterruptedException {
        goToLoginPage();
        login.addUserName();
        actions.sendKeys("VeljkoITBC").perform();
        login.addPassword();
        actions.sendKeys("Veljko14^%").perform();
        login.clickLoginBtn();
        Thread.sleep(600);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }


    @Test
    public void clickGoToBookStoreBtn() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        profile.clickGoToBookStoreBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/books");
    }

    @Test
    public void clickDeleteAccountBtn() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        profile.clickDeleteAccountBtn();
        Thread.sleep(3000);
        //wdwait.until(ExpectedConditions.alertIsPresent());
        driver.findElement(By.id("closeSmallModal-cancel")).click();
        Thread.sleep(600);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Assert.assertEquals(driver.findElement(By.id("userName-value")).getText(), "VeljkoITCB");
    }

    @Test
    public void clickDeleteAllBooks() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        profile.clickDeleteAllBooks();
        Thread.sleep(3000);
        driver.findElement(By.id("closeSmallModal-ok")).click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }

    @Test
    public void clickDeleteAllBooksCancel() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        profile.clickDeleteAllBooks();
        Thread.sleep(3000);
        driver.findElement(By.id("closeSmallModal-cancel")).click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }
    @Test
    public void clickDeleteOneBookCancel() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        profile.clickDeleteOneBook();
        Thread.sleep(3000);
        driver.findElement(By.id("closeSmallModal-cancel")).click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void clickDeleteOneBook() throws InterruptedException {
        fillLoginForm();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        profile.clickDeleteOneBook();
        Thread.sleep(3000);
        driver.findElement(By.id("closeSmallModal-ok")).click();
        wdwait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test
    public void addBook() throws InterruptedException {
        clickGoToBookStoreBtn();
        getBook(3);
    }
}
