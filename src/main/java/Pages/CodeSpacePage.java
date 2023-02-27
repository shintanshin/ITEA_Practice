package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CodeSpacePage extends BasePage {
    private final static String TITLE = "Code Space Page";
    private WebElement linkToIssuePage = driver.findElement(By.xpath("//a[@id='issues-tab']"));

    public CodeSpacePage(WebDriver driver) {
        super(driver, TITLE);
    }

    public IssuesPage goToIssuePage() {
        linkToIssuePage.click();
        log.info("Successful navigation to the Issue page");
        return new IssuesPage(driver);
    }
}
