package testElements;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage {
    @Test
    public void goToButtonsPage() throws InterruptedException {
        selectPage(0);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        buttons.getButtonsPageLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }
    @Test
    public void clickDoubleClick() throws InterruptedException {
        goToButtonsPage();
        buttons.clickDoubleClick();
        Assert.assertTrue(buttons.getDoubleMsg().isDisplayed());
    }
    @Test
    public void clickRightClick() throws InterruptedException {
        goToButtonsPage();
        buttons.clickRightClick();
        Assert.assertTrue(buttons.getRightClickMsg().isDisplayed());
    }
    @Test
    public void click() throws InterruptedException {
        goToButtonsPage();
        buttons.click();
        Assert.assertTrue(buttons.getDynamicClickMessage().isDisplayed());
    }

}
