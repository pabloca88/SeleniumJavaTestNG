import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrowserTest {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        WebElement textbox = driver.findElement(By.name("q"));
        textbox.sendKeys("Automation Step by Step");

        //or using xpath:

        //driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Automation Step by Step");

        //WE CREATE A LIST OF WEBELEMENTS , COUNT THE WEBELEMENTS AND PRINT IT ON CONSOLE
        List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
        int count = listOfInputElements.size();
        System.out.println("Count of Input elements: "+ count);

        //driver.close(); //close one instance
        //driver.quit();  //close the complete instances
    }

}
