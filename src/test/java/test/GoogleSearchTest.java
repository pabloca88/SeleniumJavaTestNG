package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

    private static WebDriver driver = null;

    public static void main(String[] args) {

        googleSearch();
    }

    public static void googleSearch(){

        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");

        //enter text in searchbox

       /* WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation Step by Step");*/

        //we uso POM to reference the text_box search method:
        GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");

        //click on search button
       /* WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.sendKeys(Keys.RETURN);*/

        // We uso POM to refernce the button_search method on the page class
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN); //lik sendKeys.(click);

        //close browser
        driver.close();

        System.out.println("Test Completed Successfully");
    }
}
