package testElements;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePage {

    @Test
    public void goToRadioButtonPage(){
        selectPage(0);
        radioButton.getRadioButtonLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }
    @Test
    public void clickYes() throws InterruptedException {
        goToRadioButtonPage();
        radioButton.clickYesRadio();
        Assert.assertEquals(radioButton.radioMessage(), "You have selected Yes");
    }
    @Test
    public void clickImpressive(){
        goToRadioButtonPage();
        radioButton.clickImpressiveRadio();
        Assert.assertEquals(radioButton.radioMessage(), "You have selected Impressive");
    }
    @Test
    public void isNoDisabled(){
        goToRadioButtonPage();
        Assert.assertFalse(radioButton.isNoEnabled());
    }

}