package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

    WebDriver driver = null;

    //Objets
    By textbox_search = By.name("q");
    By button_search = By.xpath("//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]");

    public GoogleSearchPageObjects(WebDriver driver){ //we built a constructor for the driver we use in this class
        this.driver = driver;
    }

    //Actions
    public void setTextInSearchBox(String text){
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void clickSearchButton() {
        driver.findElement(button_search).click();
                //sendKeys(Keys.RETURN); //similar to hitting the enter button
    }
}
