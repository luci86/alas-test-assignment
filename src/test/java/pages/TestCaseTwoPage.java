package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaseTwoPage {

    WebDriver driver;
    Wait<WebDriver> wait;

    public TestCaseTwoPage (WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Waiter Exception");

    }

    @FindBy(css = ".gLFyf")
    public WebElement searchBox;

    @FindBy(css = ".FPdoLc > center:nth-child(1) > input:nth-child(1)")
    public WebElement btn;

    @FindBy(xpath = "//*[@id=\"result-stats\"]")
    public WebElement noOfResults;



    public void searchForCheese () {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys("cheese");
        btn.click();
    }

    public void getNumberOfResults () {
        String results= noOfResults.getText();
        String res= results.replaceAll("[^0-9]","");
        String r=res.substring(0,10);

        long x=Long.parseLong(r);



        int y=777;

        try {
            assertEquals(x,y);
        } catch (AssertionError e) {
            System.out.println("There is too much cheese on the internet");
            throw e;
        }
    }
}
