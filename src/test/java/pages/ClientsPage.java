package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientsPage {

    private WebDriver driver;

    public ClientsPage(WebDriver driver) {
        System.out.println("Created cleint page constructor");
        this.driver=driver;
    }

    public void searchClient() {
        driver.findElement(By.linkText("CLIENTS")).click();
        driver.findElement(By.id("search")).sendKeys("Thoughtworks");
        driver.findElement(By.className("searchBtn")).click();
        driver.findElement(By.linkText("Select Client")).click();
    }

    public void editClientDetails(){
        driver.findElement(By.linkText("Edit Client Details")).click();
        driver.findElement(By.id("client_contact_person_name")).clear();
        driver.findElement(By.id("client_contact_person_name")).sendKeys("ThoughtworksNew");
        driver.findElement(By.id("client_address")).clear();
        driver.findElement(By.id("client_address")).sendKeys("twAddressNew");
        driver.findElement(By.name("commit")).click();
    }
}
