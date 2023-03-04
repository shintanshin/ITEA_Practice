package uiGitHub;

import Pages.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    Logger logger;

    public BaseTest() {
        this.logger = LogManager.getLogger();
    }

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\HomePractice\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com/login");
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
