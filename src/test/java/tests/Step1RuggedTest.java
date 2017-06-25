package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ClientsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Step1RuggedTest {

    public WebDriver driver;
    public ClientsPage clientsPage = new ClientsPage(driver);
    public LoginPage loginPage = new LoginPage(driver);

    private String USER_NAME = "letslearnandshare@gmail.com";
    private String PASSWORD = "!abcd1234";

    @Test
    public void testEditAccount() {
        loginPage.login(USER_NAME, PASSWORD);
        clientsPage.searchClient();
        clientsPage.editClientDetails();
    }

    @Test
    public void testAddQuotationForClient() {
        loginPage.login(USER_NAME, PASSWORD);
        clientsPage.searchClient();
        driver.findElement(By.linkText("Quotations")).click();
        driver.findElement(By.partialLinkText("Add New Quotation")).click();
        driver.findElement(By.id("quotation_order_placed_by")).sendKeys("Quotation1");
        driver.findElement(By.id("quotation_event_name")).sendKeys("Event1");
        driver.findElement(By.id("quotation_event_date")).sendKeys("30-12-2016");
        updateQuotationDetails();
    }

    @Test
    public void testServiceTaxSearch(){
        loginPage.login(USER_NAME, PASSWORD);
        driver.findElement(By.linkText("TAXES")).click();
        driver.findElement(By.linkText("SERVICE TAXES")).click();
        driver.findElement(By.id("start_date")).sendKeys("16-02-2017");
        driver.findElement(By.id("end_date")).sendKeys("17-02-2017");
        driver.findElement(By.cssSelector("#end_date + input")).click();
    }

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        logout();
        driver.close();
        driver.quit();
    }

    private void logout() {
        driver.findElement(By.cssSelector("span.glyphicon-log-out")).click();
    }

    private void updateQuotationDetails() {
        driver.findElement(By.name("commit")).click();
        driver.switchTo().alert().accept();
    }


}
