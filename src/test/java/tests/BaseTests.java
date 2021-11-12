package tests;

import driver.DriverInitUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.TestCaseOnePage;
import pages.TestCaseThreePage;
import pages.TestCaseTwoPage;

import java.io.IOException;

public class BaseTests {

    DriverInitUtil driverInitUtil;
    TestCaseOnePage testCaseOnePage;
    TestCaseTwoPage testCaseTwoPage;
    TestCaseThreePage testCaseThreePage;

    //  This part initializes the web driver and page object classes
    @BeforeEach
    public void beforeAllTests () {

        driverInitUtil = new DriverInitUtil();
        driverInitUtil.webDriverSetup("Firefox");
        testCaseOnePage = new TestCaseOnePage(driverInitUtil.driver);
        testCaseTwoPage = new TestCaseTwoPage(driverInitUtil.driver);
        testCaseThreePage= new TestCaseThreePage(driverInitUtil.driver);


    }
    //  This defines the base url and browser options
    public void beforeMethodInitialSteps(String baseUrl){

        driverInitUtil.driver.navigate().to(baseUrl);
        driverInitUtil.driver.manage().window().maximize();
    }
    //        This executes the first test
    public void executeTestOne (String baseUrl) throws IOException {

        beforeMethodInitialSteps(baseUrl);

        testCaseOnePage.searchForDemoqa();
        testCaseOnePage.openDroppable();
        testCaseOnePage.dragAndDrop();
        testCaseOnePage.getTextFromDrop();
        testCaseOnePage.makeScreenshot();
        testCaseOnePage.goToTooltips();
        testCaseOnePage.getTextFromHover();
    }
    //  this executes the second test
    public void executeTestTwo (String baseUrl) {

        beforeMethodInitialSteps(baseUrl);

        testCaseTwoPage.searchForCheese();
        testCaseTwoPage.getNumberOfResults();


    }
//    this executes the third test
    public void executeTestThree (String baseUrl)  {

        beforeMethodInitialSteps(baseUrl);

        testCaseThreePage.login();
        testCaseThreePage.goToCandidates();
        testCaseThreePage.getNumberOfCandidates();


    }




    //  This closes the web driver after performing the test
    @AfterEach
    public void afterAllTest() {

        try {
            driverInitUtil.driver.quit();
        }catch(Exception e){
            System.out.println("Window failed to close");
        }
    }
}
