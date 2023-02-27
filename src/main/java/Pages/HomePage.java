package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private final static String TITLE = "Home Page";
    private WebElement codeSpaceLink = driver.findElement(By.xpath("//loading-context//a[contains(text(),'AnnaS-V')]"));

    public HomePage(WebDriver driver) {
        super(driver, TITLE);
    }

    public CodeSpacePage goToCodePage() {
        codeSpaceLink.click();
        log.info("Successful navigation to the Code page");
        return new CodeSpacePage(driver);
    }
}
