package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestAssignmentTests extends BaseTests {


    @Test
    public void testOne() throws IOException {
        executeTestOne("https://www.google.com/");
    }

    @Test
    public void testTwo() {
        executeTestTwo("https://www.google.com/");

    }

    @Test
    public void testThree() {
        executeTestThree("https://orangehrm-demo-7x.orangehrmlive.com");

    }

}