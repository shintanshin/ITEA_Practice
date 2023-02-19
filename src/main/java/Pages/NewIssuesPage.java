package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewIssuesPage extends BasePage {
    private WebElement issueTitleField = driver.findElement(By.id("issue_title"));
    private WebElement submitNewIssue = driver.findElement(By.xpath("//*[@class='btn-primary btn ml-2']"));

    public NewIssuesPage(WebDriver driver) {
        super(driver);
    }

    public OpenIssues createNewIssue(String title) {
        issueTitleField.sendKeys(title);
        submitNewIssue.click();
        return new OpenIssues(driver);
    }
}
