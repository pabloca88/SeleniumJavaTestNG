import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IvanaTesting {
    public static void main(String[] args) {
     busquedaGoogle();
    }

    public static void busquedaGoogle() {
        System.setProperty("webdriver.chrome.driver","/Users/pablocalvano/Documents/Automation/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        //navegamos a google
        driver.get("https://www.google.com/");

        //crear el elemento de la barra de google
        WebElement barraGoogle= driver.findElement(By.name("q"));
        barraGoogle.sendKeys("hola");

        //click en el boton buscar
        WebElement botonBusqueda= driver.findElement(By.name("btnK"));
        botonBusqueda.click();

        //driver.close();
        System.out.println("no me gusta");

    }
}
