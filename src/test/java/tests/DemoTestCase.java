package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoTestCase extends BaseStep {


    @Test
    public void testEditAccount() {
        loginPage.login();
        homePage.goToClientsPage();
        clientsPage.searchClient();
        assert (clientsPage.getClientName().equalsIgnoreCase("Thoughtworks 1")); ;
        editClientDetailsPage.editClientDetails();
        loginPage.logout();
    }

    @Test
    public void testAddQuotationForClient() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://accountsdemo.herokuapp.com");
        driver.findElement(By.id("user_email")).sendKeys("letslearnandshare@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("!abcd1234");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("CLIENTS")).click();
        driver.findElement(By.id("search")).sendKeys("Thoughtworks");
        driver.findElement(By.className("searchBtn")).click();
        driver.findElement(By.linkText("Select Client")).click();
        driver.findElement(By.linkText("Quotations")).click();
        driver.findElement(By.partialLinkText("Add New Quotation")).click();
        driver.findElement(By.id("quotation_order_placed_by")).sendKeys("Quotation1");
        driver.findElement(By.id("quotation_event_name")).sendKeys("Event1");
        driver.findElement(By.id("quotation_event_date")).sendKeys("30-12-2016");
        driver.findElement(By.name("commit")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("span.glyphicon-log-out")).click();
        driver.quit();
    }

    @Test
    public void testServiceTaxSearch(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://accountsdemo.herokuapp.com");
        driver.findElement(By.id("user_email")).sendKeys("letslearnandshare@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("!abcd1234");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("TAXES")).click();
        driver.findElement(By.linkText("SERVICE TAXES")).click();
        driver.findElement(By.id("start_date")).sendKeys("16-02-2017");
        driver.findElement(By.id("end_date")).sendKeys("17-02-2017");
        driver.findElement(By.cssSelector("#end_date + input")).click();
        driver.quit();
    }
}
