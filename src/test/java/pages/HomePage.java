package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by thivyalakshimi on 25/06/17.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        this.driver= driver;
    }

    public void goToClientsPage() {
        driver.findElement(By.linkText("CLIENTS")).click();
    }
}
