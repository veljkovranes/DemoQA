package testElements;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinksTest extends BasePage {

    @Test
    public void goToBrokenLinksPage() throws InterruptedException {
        selectPage(0);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(600);
        brokenLinksImages.getBrokenLinksLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/broken");
    }
    @Test
    public void checkValidImage() throws InterruptedException {
        goToBrokenLinksPage();
        Assert.assertTrue(brokenLinksImages.isValidImageDisplayed());
    }
    @Test
    public void checkInvalidImage() throws InterruptedException {
        goToBrokenLinksPage();
        Assert.assertFalse(brokenLinksImages.isBrokenImageDisplayed());
    }
    @Test
    public void clickValidLink() throws InterruptedException {
        goToBrokenLinksPage();
        brokenLinksImages.clickValidLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
    }
    @Test
    public void clickInvalidLink() throws InterruptedException {
        goToBrokenLinksPage();
        brokenLinksImages.clickInvalidLink();
        Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
    }
}
