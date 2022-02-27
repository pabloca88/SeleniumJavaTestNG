import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch(){

        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //go to google.com
        driver.get("https://google.com");

        //enter text in searchbox

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation Step by Step");

        //click on search button

        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        //close browser
        driver.close();

        System.out.println("Test Completed Successfully");
    }
}
