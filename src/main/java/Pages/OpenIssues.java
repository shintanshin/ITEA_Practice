package Pages;

import org.openqa.selenium.WebDriver;

public class OpenIssues extends BasePage {
    private final static String TITLE = "Open Issue Page";

    public OpenIssues(WebDriver driver) {
        super(driver, TITLE);
    }
}
