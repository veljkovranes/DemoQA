package formTest;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeFormTest extends BasePage {
    @Test
    public void goToPracticeForm() throws InterruptedException {
        selectPage(1);
        practiceForm.clickPracticeForm();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/automation-practice-form");
    }
    @Test
    public void fillForm() throws InterruptedException {
        goToPracticeForm();
        practiceForm.setFirstName();
        actions.sendKeys("Veljko").perform();
        practiceForm.setLastName();
        actions.sendKeys("Vranes").perform();
        practiceForm.setEmail();
        actions.sendKeys("veljko@gmail.com").perform();
        practiceForm.setUserNumber();
        actions.sendKeys("0635512551").perform();
        practiceForm.getSubject();
        actions.sendKeys("Neki subject").perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        practiceForm.setCurrentAddress();
        actions.sendKeys("Poenkareova 2").perform();

    }
}
