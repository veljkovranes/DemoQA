package base;

import bookStoreApplication.BookStore;
import bookStoreApplication.Login;
import bookStoreApplication.Profile;
import elements.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import form.PracticeForm;

import java.time.Duration;
import java.util.List;

public class BasePage {
    public WebDriverManager wdm;
    public WebDriver driver;
    public WebDriverWait wdwait;

    public Actions actions;

    public TextBox textBoxPage;

    public RadioButton radioButton;
    public Links links;
    public DynamicProperties dynamicProperties;

    public BrokenLinksImages brokenLinksImages;
    public Buttons buttons;

    public Login login;
    public BookStore bookStore;
    public Profile profile;
    public PracticeForm practiceForm;

    @BeforeClass
    public void beforeClass() {
        wdm = new ChromeDriverManager();
        wdm.setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        textBoxPage = new TextBox(driver, wdwait);
        radioButton = new RadioButton(driver, wdwait);
        buttons = new Buttons(driver, wdwait, actions);
        links = new Links(driver, wdwait, actions);
        brokenLinksImages = new BrokenLinksImages(driver, wdwait, actions);
        dynamicProperties = new DynamicProperties(driver, wdwait, actions);
        login = new Login(driver, actions, wdwait);
        bookStore = new BookStore(wdwait, driver, actions);
        profile = new Profile(driver, wdwait, actions);
        practiceForm = new PracticeForm(driver, wdwait, actions);

    }

    public List<WebElement> homePageNavigation() {
        List<WebElement> cards = driver.findElements(By.className("card-up"));
        return cards;
    }
    public void selectPage(int i){
        driver.navigate().to("https://demoqa.com/");
        homePageNavigation().get(i).click();
    }
    public void goHomePage(){
        driver.navigate().to("https://demoqa.com/");
    }
    public List<WebElement> bookStore(){
        List<WebElement> listOfBooks = driver.findElements(By.className("rt-tr-group"));
        return listOfBooks;
    }
    /*public List<WebElement> books() {
        return driver.findElements(By.className("mr-2"));
    }*/

    /*return driver.findElement(By.className("books-wrapper")).findElements(By.tagName("a"));

    public void getBook(int i){
        bookStore().get(i).click();
    }*/


    @AfterClass
    public void afterClass() {
        wdwait = null;
        //driver.quit();
        driver = null;
        wdm = null;
    }

}
