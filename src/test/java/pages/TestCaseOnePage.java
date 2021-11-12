package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TestCaseOnePage  {

    WebDriver driver;
    Wait<WebDriver> wait;

    //Constructor with webdriver and custom wait
    public TestCaseOnePage (WebDriver driver) {


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
    @FindBy(css = ".gLFyf")
    public WebElement searchBox;

    @FindBy(css = ".FPdoLc > center:nth-child(1) > input:nth-child(1)")
    public WebElement btn;

    @FindBy(xpath = "/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a/h3")
    public WebElement demoqaLink;

    @FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div/div[5]")
    public WebElement interactions;

    @FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[4]/span")
    public WebElement droppable;

    @FindBy(xpath= "//*[@id=\"draggable\"]")
    public WebElement dragme;

    @FindBy(xpath= "//*[@id=\"droppable\"]")
    public WebElement drophere;

    @FindBy(css= ".ui-state-highlight > p:nth-child(1)")
    public WebElement dropped;

    @FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/span/div")
    public WebElement widgets;

    @FindBy(xpath= "/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[7]/span")
    public WebElement tooltips;

    @FindBy(css= "#toolTipButton")
    public WebElement hovermetosee;

    @FindBy(xpath= "//*[@id=\"toolTipButton\"]")
    public WebElement textfromhover;



    public void searchForDemoqa () {
        searchBox.sendKeys("demoqa");
        btn.click();
        demoqaLink.click();
    }

    public void openDroppable() {
        wait.until(ExpectedConditions.visibilityOf(interactions));
        interactions.click();
        wait.until(ExpectedConditions.visibilityOf(droppable));
        droppable.click();
    }

    public void dragAndDrop() {
        Actions act=new Actions(driver);
        act.moveToElement(dragme).clickAndHold().build().perform();
        act.moveToElement(drophere).release().build().perform();
    }
    public void getTextFromDrop() {
        String text=dropped.getText();
        System.out.println(text);
    }
    public void makeScreenshot() throws IOException {
        TakesScreenshot screenshot=((TakesScreenshot) driver);
        File SrcFile=screenshot.getScreenshotAs(OutputType.FILE);
        String dest=System.getProperty(("user.dir")+"Screenshots/1.jpg");

        FileHandler.copy(SrcFile, new File("Screenshots/1.jpg"));
    }
    public void goToTooltips() {
        widgets.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",tooltips);
        tooltips.click();
    }
    public void getTextFromHover() {


        Actions hoverAction= new Actions(driver);
        hoverAction.moveToElement(hovermetosee).click().perform();
        String hovertext=textfromhover.getText();
        System.out.println(hovertext);
    }
}
