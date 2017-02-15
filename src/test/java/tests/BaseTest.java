package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ClientsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    ClientsPage clientsPage = new ClientsPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("http://accountsdemo.herokuapp.com");
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
}
