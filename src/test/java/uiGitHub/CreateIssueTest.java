package uiGitHub;

import Pages.IssuesPage;
import Pages.NewIssuesPage;
import org.junit.jupiter.api.Test;
import uiGitHub.BaseTest;

public class CreateIssueTest extends BaseTest {
    @Test
    public void createNewIssue() {
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.goToNewIsPage();
        NewIssuesPage newIssuesPage = new NewIssuesPage(driver);
        newIssuesPage.createNewIssue("New issue");
    }
}
