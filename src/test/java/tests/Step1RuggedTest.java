package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class Step1RuggedTest extends BaseTest{

    private String USER_NAME = "letslearnandshare@gmail.com";
    private String PASSWORD = "!abcd1234";

    @Test
    public void testEditAccount() {
        loginPage.login(USER_NAME, PASSWORD);
        clientsPage.searchClient();
        clientsPage.editClientDetails();
    }

    @Test
    public void verifyAddQuotationForClient() {
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
    public void verifyServiceTaxSearch(){
        loginPage.login(USER_NAME, PASSWORD);
        driver.findElement(By.linkText("TAXES")).click();
        driver.findElement(By.linkText("SERVICE TAXES")).click();
        driver.findElement(By.id("start_date")).sendKeys("16-02-2017");
        driver.findElement(By.id("end_date")).sendKeys("17-02-2017");
        driver.findElement(By.cssSelector("#end_date + input")).click();
    }





    private void updateQuotationDetails() {
        driver.findElement(By.name("commit")).click();
        driver.switchTo().alert().accept();
    }


}
