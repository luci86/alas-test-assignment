package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCaseThreePage {

    WebDriver driver;
    Wait<WebDriver> wait;

    //Constructor with webdriver and custom wait
    public TestCaseThreePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Waiter Exception");

    }

    // Defining locators
    @FindBy(xpath = "//*[@id=\"btnLogin\"]")
    public WebElement loginBtn;

    @FindBy(css = "#menu_recruitment_viewRecruitmentModule > a:nth-child(1) > span:nth-child(2)")
    public WebElement recruitmentMenu;

    @FindBy(css = "#menu_recruitment_viewCandidates > span:nth-child(2)")
    public WebElement candidatesList;

    @FindBy(xpath = "//*[@id=\"noncoreIframe\"]")
    public WebElement iFrame;

    @FindBy(className = "material-checkbox")
    public List<WebElement> tableOfCandidates;




    public void login() {
        loginBtn.click();
    }

    public void goToCandidates() {
        recruitmentMenu.click();
        candidatesList.click();
    }

    public void getNumberOfCandidates()  {
        wait.until(ExpectedConditions.visibilityOf(iFrame));
        driver.switchTo().frame(iFrame);
        wait.until(ExpectedConditions.visibilityOfAllElements(tableOfCandidates));
        int numberOfCandidates = tableOfCandidates.size();
        System.out.println(numberOfCandidates);
    }


}
