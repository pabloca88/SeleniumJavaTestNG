package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

    private static WebElement element = null;

    public static WebElement textbox_search(WebDriver driver) {
        WebElement element = driver.findElement(By.name("q"));
        return element;
    }

    public static WebElement button_search(WebDriver driver) {
        WebElement element = driver.findElement(By.name("btnK"));
        return element;
    };
}
