package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsPage {

    private WebDriver driver;

    public ClientsPage(WebDriver driver) {
        this.driver=driver;
    }

//    private WebElement clientsTabBtn=driver.findElement(By.linkText("CLIENTS"));
//    private WebElement searchTextBox =  driver.findElement(By.id("search"));
//    private WebElement searchBtn = driver.findElement(By.className("searchBtn"));
//    private WebElement selectClientBtn = driver.findElement(By.linkText("Select Client"));
//    private WebElement editClientDetailsBtn = driver.findElement(By.linkText("Edit Client Details"));
//    private WebElement clientContactPersonName = driver.findElement(By.id("client_contact_person_name"));
//    private WebElement clientAddress = driver.findElement(By.id("clientAddress"));
//    private WebElement updateClientBtn = driver.findElement(By.name("commit"));

    public void searchClient() {
//        clientsTabBtn.click();
//        searchTextBox.sendKeys("Thoughtworks");
//        searchBtn.click();
//        selectClientBtn.click();
        driver.findElement(By.linkText("CLIENTS")).click();
        driver.findElement(By.id("search")).sendKeys("Thoughtworks");
        driver.findElement(By.className("searchBtn")).click();
        driver.findElement(By.linkText("Select Client")).click();
    }

    public void editClientDetails(){
//        editClientDetailsBtn.click();
//        clientContactPersonName.clear();
//        clientContactPersonName.sendKeys("ThoughtworksNew");
//        clientAddress.clear();
//        clientAddress.sendKeys("twAddressNew");
//        updateClientBtn.click();

        driver.findElement(By.linkText("Edit Client Details")).click();
        driver.findElement(By.id("client_contact_person_name")).clear();
        driver.findElement(By.id("client_contact_person_name")).sendKeys("ThoughtworksNew");
        driver.findElement(By.id("clientAddress")).clear();
        driver.findElement(By.id("clientAddress")).sendKeys("twAddressNew");
        driver.findElement(By.name("commit")).click();
    }
}
