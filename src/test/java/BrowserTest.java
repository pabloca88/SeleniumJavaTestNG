import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);

        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        driver.close(); //close one instance
        //driver.quit();  //close the complete instances
    }

}
