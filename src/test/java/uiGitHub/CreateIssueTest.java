package uiGitHub;

import Pages.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateIssueTest extends BaseTest {
    @DataProvider(name="Title&CommentData")
    public Object[][] createData(){
        return new Object[][]{
                {"Issue for UI","Create UI tests"},
                {"Issue for API","Create API tests"},
                {"Issue for Java","Create Java tests"}

        };
    }
    @Test(dataProvider = "Title&CommentData")
    public void createNewIssue(String title, String comment) {
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
        newIssuesPage.createNewIssue(title,comment);
    }
}
