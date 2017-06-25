package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by abinayav on 15/02/17.
 */
public class EditClientDetailsPage extends BasePage {


    public EditClientDetailsPage(WebDriver driver) {
        this.driver=driver;
    }
    public void editClientDetails() {
        driver.findElement(By.linkText("Select Client")).click();
        driver.findElement(By.linkText("Edit Client Details")).click();
        driver.findElement(By.id("client_contact_person_name")).clear();
        driver.findElement(By.id("client_contact_person_name")).sendKeys("ThoughtworksNew");
        driver.findElement(By.id("client_address")).clear();
        driver.findElement(By.id("client_address")).sendKeys("twAddressNew");
        driver.findElement(By.name("commit")).click();
    }
}
