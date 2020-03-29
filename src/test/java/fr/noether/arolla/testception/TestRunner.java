package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        //---- Test Should be Setup
        var testMethodShouldBeCalled = new MyTestClass();

        if (testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have not been called yet.");
        }

        testMethodShouldBeCalled.thisTestMethodShouldBeCalled();

        if (!testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have been called.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeCalled : OK");

        //---- Test Should be Setup ----
        var testMethodShouldBeSetup = new MyTestClass();

        if(testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have not been setup yet.");
        }

        testMethodShouldBeSetup.setUp();
        testMethodShouldBeSetup.thisTestMethodShouldBeSetUp();

        if (!testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have been setup.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeSetup : OK");
    }
}
