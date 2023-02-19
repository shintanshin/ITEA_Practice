package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BasePage {
    private WebElement buttonNewIssue = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));

    public IssuesPage(WebDriver driver) {
        super(driver);
    }

    public NewIssuesPage goToNewIsPage() {
        buttonNewIssue.click();
        return new NewIssuesPage(driver);
    }
}
