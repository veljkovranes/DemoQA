package testElements;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class LinksTest extends BasePage {
    @Test
    public void goToLinksPage() throws InterruptedException {
        selectPage(0);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(600);
        links.getLinks().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/links");
    }
    @Test
    public void clickHomeLink() throws InterruptedException {
        goToLinksPage();
        links.clickSimpleLink();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> allTabs = new ArrayList<>(tabs);
        driver.switchTo().window(allTabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }
    @Test
    public void clickHomeDynamic() throws InterruptedException {
        goToLinksPage();
        links.clickDynamicLink();
        Set<String> tabs = driver.getWindowHandles();
        ArrayList<String> allTabs = new ArrayList<>(tabs);
        driver.switchTo().window(allTabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }
    @Test
    public void clickCreated() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(600);
        links.clickCreated();
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
    @Test
    public void clickNoContent() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(600);
        links.clickNoContent();
        Thread.sleep(600);
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
    @Test
    public void clickMoved() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(600);
        links.clickMoved();
        Thread.sleep(600);
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
    @Test
    public void clickBadRequest() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(600);
        links.clickBadRequest();
        Thread.sleep(600);
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
    @Test
    public void clickUnauthorized() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(600);
        links.clickUnauthorized();
        Thread.sleep(600);
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
    @Test
    public void clickForbidden() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(700);
        links.clickForbidden();
        Thread.sleep(600);
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
    @Test
    public void clickNotFound() throws InterruptedException {
        goToLinksPage();
        Thread.sleep(600);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        links.clickInvalidUrl();
        Thread.sleep(600);
        Assert.assertTrue(links.getLinkResponse().isDisplayed());
    }
}
