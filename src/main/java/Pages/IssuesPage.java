package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BasePage {
    private final static String TITLE = "Issue Page";
    private WebElement buttonNewIssue = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));

    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public NewIssuesPage goToNewIsPage() {
        buttonNewIssue.click();
        log.info("Successful navigation to the New Issue page");
        return new NewIssuesPage(driver);
    }
}
