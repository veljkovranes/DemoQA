package testElements;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BasePage {
    @Test
    public void goToDynamicPropertiesPage() throws InterruptedException {
        selectPage(0);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(600);
        dynamicProperties.getDynamicLink().click();
    }
    @Test
    public void clickEnableAfter() throws InterruptedException {
        goToDynamicPropertiesPage();
        Thread.sleep(5000);
        dynamicProperties.clickEnableAfter();
    }
    @Test
    public void clickChangeColor() throws InterruptedException {
        goToDynamicPropertiesPage();
        dynamicProperties.clickColorChange();
    }
    @Test
    public void clickVisibleAfter() throws InterruptedException {
        goToDynamicPropertiesPage();
        Thread.sleep(5100);
        dynamicProperties.clickVisibleAfter();
    }
}
