package testElements;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BasePage {


    @Test
    public void goToTextBoxPage() throws InterruptedException {
    selectPage(0);
    Thread.sleep(1000);
    textBoxPage.getTextBoxLink().click();
    Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
    }
    @Test
    public void validForm() throws InterruptedException {
        goToTextBoxPage();
        textBoxPage.addFullName("Veljko Vranes");
        textBoxPage.addCurrentAddress("Carigradska 2");
        textBoxPage.addPermanentAddress("Vojvode Dobrnjca 4");
        textBoxPage.addEmail("veljko@gmail.com");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        textBoxPage.clickSubmitButton();
        Assert.assertEquals(textBoxPage.getFullName().getAttribute("value"), "Veljko Vranes");
        Assert.assertEquals(textBoxPage.getCurrentAddress().getAttribute("value"), "Carigradska 2");
        Assert.assertEquals(textBoxPage.getPermanentAddress().getAttribute("value"), "Vojvode Dobrnjca 4");
        Assert.assertEquals(textBoxPage.getEmail().getAttribute("value"), "veljko@gmail.com");
    }
}
