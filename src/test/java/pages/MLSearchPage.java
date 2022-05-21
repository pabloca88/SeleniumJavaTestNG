package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MLSearchPage {
    WebDriver driver = null;

    By search_bar = By.xpath(".//*[@aria-label=\"Ingresá lo que quieras encontrar\"]");
    By search_button = By.xpath(".//*[@aria-label=\"Buscar\"]");

    //We create a constructor to use the methods on the test
    public MLSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setTextInSearchBox(String text) {
        driver.findElement(search_bar).clear();
        driver.findElement(search_bar).sendKeys(text);
    };

    public void clickSearchButton(){
        driver.findElement(search_button).click();
    }

}

