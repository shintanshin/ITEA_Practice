package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage {
    private final static String TITLE = "Login Page";

    private WebElement logInField = driver.findElement(By.id("login_field"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement logInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));

    public LogInPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public HomePage LogIn(String login, String password) {
        logInField.sendKeys(login);
        passwordField.sendKeys(password);
        logInButton.click();
        log.info("Authorization success");
        return new HomePage(driver);
    }
}
