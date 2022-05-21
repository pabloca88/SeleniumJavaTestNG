package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MLLandingPage {
    WebDriver driver;

    public MLLandingPage (WebDriver driver) {
        this.driver = driver;
    }
    By  langOption_Argentina = By.id("AR");

    public void basicValidation(){
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"Mercado Libre Argentina - Envíos Gratis en el día"); }
    public void clickLangOption(){
        driver.findElement(langOption_Argentina).click();
    }


}
