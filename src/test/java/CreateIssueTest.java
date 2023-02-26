import Pages.*;
import org.junit.jupiter.api.Test;

public class CreateIssueTest extends BaseTest {
    @Test
    public void createNewIssue() {
        LogInPage logInPage = new LogInPage(driver);
        logger.info("Starting Login process");
        logInPage.LogIn("anna.smahliivaza@gmail.com", "anna.smahliivaza@gmail.com");
        HomePage homePage = new HomePage(driver);
        homePage.goToCodePage();
        CodeSpacePage codeSpacePage = new CodeSpacePage(driver);
        codeSpacePage.goToIssuePage();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToNewIsPage();
        NewIssuesPage newIssuesPage = new NewIssuesPage(driver);
        logger.info("Starting create new issue process");
        newIssuesPage.createNewIssue("New issue");
    }
}
