package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MLLandingPage;
import pages.MLResultsPage;
import pages.MLSearchPage;

import java.util.Iterator;

public class MLTestChallenge {

    static WebDriver driver = null;

    @BeforeTest
    public void  tearUp(){

        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mercadolibre.com/");
    }

    @Test
    public void searchCar() throws InterruptedException {

        MLLandingPage landing = new MLLandingPage(driver);
        MLSearchPage searchPage = new MLSearchPage(driver);
        MLResultsPage resultPage = new MLResultsPage(driver);

        //Landing Page
        landing.clickLangOption();
        landing.basicValidation();

        //SearchPage
        searchPage.setTextInSearchBox("Autos");
        searchPage.clickSearchButton();

        //Accept cookies & Search Results Page
        resultPage.clickOnAcceptCookies();
        resultPage.clickOnAcceptCalcLocation();

        resultPage.clickOnRange(); // hago click en el primer rango
        resultPage.clickOnSelectedProvince(); //Click en la opcion Cordoba


        resultPage.clickOnOrderBy();
        resultPage.orderSearchResult();



        //Validaciones
        Assert.assertEquals("Córdoba", driver.findElement(By.xpath(".//div[contains(text(), 'Córdoba')]")).getText());
        Assert.assertEquals("Hasta $ 2.000.000", driver.findElement(By.xpath(".//div[contains(text(), 'Hasta $ 2.000.000')]")).getText());
        String resultados = driver.findElement(By.xpath("//span[contains(text(),'resultados')]")).getText();
        System.out.println("La cantidad de resultados son: "+ resultados);
    }

    @AfterTest
    public void tearDown(){
        //close the  instance
        driver.quit();
    }



}
