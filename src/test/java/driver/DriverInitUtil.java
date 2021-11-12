package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverInitUtil {

    public WebDriver driver;

    public DriverInitUtil() {


    }

    public WebDriver webDriverSetup(String browser) {

//        This is the web driver manager library, it is used for switching between different browsers
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":

                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "internet-explorer":

                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            default:

                System.out.println("Invalid input for browser type, please try again.");
                break;
        }

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        return driver;

    }

}