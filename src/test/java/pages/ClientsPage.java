package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientsPage extends BasePage{


    public ClientsPage(WebDriver driver) {
        System.out.println("Created cleint page constructor");
        this.driver=driver;
    }

    public void searchClient() {
        driver.findElement(By.id("search")).sendKeys("Thoughtworks");
        driver.findElement(By.className("searchBtn")).click();

    }


    public String getClientName() {
        return driver.findElement(By.xpath("//td[2]")).getText();
    }
}
