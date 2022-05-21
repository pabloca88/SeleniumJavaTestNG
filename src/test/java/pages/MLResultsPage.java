package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.By.*;

public class MLResultsPage {
    WebDriver driver = null;

    public MLResultsPage(WebDriver driver) { this.driver = driver;}

    // Objetos
    By acceptCookies = xpath(".//*[@data-testid=\"action:understood-button\"]");
    By acceptLocationCalc   = xpath(".//span[contains(text(),'Entendido')]");
    By price_range2M = xpath(".//*[@class=\"ui-search-money-picker__li\"]/a/span[contains(text(),'Hasta $ 2.000.000')]");
    By cordobaButton = xpath(".//*[@aria-label=\"Córdoba\"]");
    By order_by = xpath("//span[contains(text(),'Más relevantes')]");
    By order_by_asc = xpath("//span[contains(text(),'Menor precio')]");


    public void clickOnRange(){driver.findElement(price_range2M).click(); }
    public void clickOnAcceptCookies() {driver.findElement(acceptCookies).click(); }
    public void clickOnAcceptCalcLocation() {driver.findElement(acceptLocationCalc).click(); }
    public void clickOnSelectedProvince(){driver.findElement(cordobaButton).click(); }
    public void clickOnOrderBy() { driver.findElement(order_by).click(); }
    public void orderSearchResult(){ driver.findElement(order_by_asc).click(); }


};
