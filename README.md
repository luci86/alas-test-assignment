# alas-test-assignment

For this assignment I used JUnit5 and Selenium libraries with Maven builder. All of the dependencies were injected through pom.xml file. Tool used for automation is Intellij community edition.

## How to run tests

All tests are located in the src/test/java/tests/TestAssignmentTests.java class. Tests have @Test annotation and every test can be ran separatelly by right click on the @Test annotation and selecting runTest().  

## Changing browsers

For different browser execution, I used webDriverManager, which is defined in src/test/java/driver/DriverInitUtil.java class. There is an option to switch browser by changing text in src/test/java/tests/BaseTests.java class on line 24. For different browser change driverInitUtil.webDriverSetup("Firefox"); "Firefox" to desired browser. All of avaliable browsers are defined in DriverInitUtil class.
