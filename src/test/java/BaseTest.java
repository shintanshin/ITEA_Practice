import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\HomePractice\\src\\main\\resources\\drivers\\chromedriver.exe");
        //Опції нижче були додані для того щоб драйвер одразу підгружав акаунт хрому с залогіненим гітхабом.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\shint\\AppData\\Local\\Google\\Chrome\\User Data");
        options.addArguments("--profile-directory=Default");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://github.com/shintanshin/ITEA_AQA/issues");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
