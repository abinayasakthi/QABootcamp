package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    private WebElement userEmail = driver.findElement(By.id("user_email"));
    private WebElement userPassword = driver.findElement(By.id("user_password"));
    private WebElement loginInBtn = driver.findElement(By.name("commit"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String userName, String passWord) {
        driver.navigate().to("http://accountsdemo.herokuapp.com");
        userEmail.sendKeys(userName);
        userPassword.sendKeys(passWord);
        loginInBtn.click();
    }

}
