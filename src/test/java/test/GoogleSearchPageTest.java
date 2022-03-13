package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();

        //importing the objects from the pages class
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

        //Create Test Case
        driver.get("https://google.com");
        driver.manage().window().maximize();

        searchPageObj.setTextInSearchBox("Java step by step");
        searchPageObj.clickSearchButton();

        driver.close();


    }
}
