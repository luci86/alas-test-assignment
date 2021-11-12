package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestThree {
    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new FirefoxDriver();
//
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//
//        driver.manage().window().maximize();
//
//
//        driver.get("https://orangehrm-demo-7x.orangehrmlive.com");

//        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".shuffle-animation")));

//        driver.findElement(By.cssSelector
//                ("#menu_recruitment_viewRecruitmentModule > a:nth-child(1) > span:nth-child(2)")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector
//                ("#menu_recruitment_viewCandidates > span:nth-child(2)")));
//        driver.findElement
//                (By.cssSelector("#menu_recruitment_viewCandidates > span:nth-child(2)")).click();

//        Thread.sleep(5000);
//        WebElement frame = driver.findElement(By.xpath("//*[@id=\"noncoreIframe\"]"));
//        driver.switchTo().frame(frame);

//        int number = driver.findElements(By.className("material-checkbox")).size();



//        System.out.println(number);
//        Thread.sleep(3000);
//
//        driver.findElement(By.id("addItemBtn")).click();
//
//
//
//        WebElement modalContainer=driver.findElement(By.xpath("//*[@id=\"modalAddCandidate\"]"));
//        WebElement modalContent=modalContainer.findElement(By.xpath(".//*[@id=\"addCandidate_firstName\"]"));
//        wait.until(ExpectedConditions.visibilityOf(modalContainer));
//        modalContent.clear();
//        modalContent.sendKeys("QA Automation");
//
//        WebElement acancy=modalContainer.findElement
//                (By.xpath("./html/body/div[1]/div[2]/div[1]/div[3]/div[2]/form/div[5]/div[1]/div/div/ul/li/a/input"));
//        wait.until(ExpectedConditions.visibilityOf(acancy));
//        acancy.click();
//        List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"dropdownObjectSearch_VzbEk\"]"));
//
//        for (WebElement ele:list){
//            System.out.println("Values"+ele.getAttribute("innerHTML"));
//
//            if (ele.getAttribute("innerHTML").contains("JavaScript")){
//                ele.click();
//
//                break;
//            }
//        }

//        Select vacancy=new Select(modalContainer.findElement
//                (By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/form/div[5]/div[1]/div/div")));
//        vacancy.selectByValue("Credit Analyst");







    }
}
