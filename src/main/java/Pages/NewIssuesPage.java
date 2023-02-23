package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewIssuesPage extends BasePage {
    private WebElement issueTitleField = driver.findElement(By.id("issue_title"));
    private WebElement submitNewIssue = driver.findElement(By.xpath("//div[2]/button[contains(text(),'Submit new issue')]"));

    public NewIssuesPage(WebDriver driver) {
        super(driver);
    }

    public OpenIssues createNewIssue(String title) {
        issueTitleField.sendKeys(title);
        submitNewIssue.click();
        return new OpenIssues(driver);
    }
}
