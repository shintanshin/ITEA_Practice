package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewIssuesPage extends BasePage {
    private final static String TITLE = "New Issue Page";
    private WebElement issueCommentField = driver.findElement(By.id("issue_body"));
    private WebElement issueTitleField = driver.findElement(By.id("issue_title"));
    private WebElement submitNewIssue = driver.findElement(By.xpath("//div[2]/button[contains(text(),'Submit new issue')]"));

    public NewIssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public OpenIssues createNewIssue(String title,String comment) {
        issueTitleField.sendKeys(title);
        issueCommentField.sendKeys(comment);
        submitNewIssue.click();
        log.info("Successful creating new issue");
        return new OpenIssues(driver);
    }
}
