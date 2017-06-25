package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
   // private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver= driver;
    }

    public void login() {
        driver.findElement(By.id("user_email")).sendKeys("letslearnandshare@gmail.com");
      driver.findElement(By.id("user_password")).sendKeys("!abcd1234");
       driver.findElement(By.name("commit")).click();
    }

    public void logout() {
        driver.findElement(By.cssSelector("span.glyphicon-log-out")).click();

    }

}
