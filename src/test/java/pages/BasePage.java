package pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
   public static WebDriver driver;

    @Before
    public void setUp(){
        startDriver();
        driver.navigate().to("http://accountsdemo.herokuapp.com");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }


}
