package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class TestRunner {

    public static void main(String[] args) {
        //---- Test Should be Setup
        var testMethodShouldBeCalled = new MyTestClass();

        if (testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have not been called yet.");
        }

        runTest(testMethodShouldBeCalled, MyTestClass::thisTestMethodShouldBeCalled);

        if (!testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have been called.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeCalled : OK");

        //---- Test Should be Setup ----
        var testMethodShouldBeSetup = new MyTestClass();

        if(testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have not been setup yet.");
        }

        runTest(testMethodShouldBeSetup, MyTestClass::thisTestMethodShouldBeSetUp);

        if (!testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have been setup.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeSetup : OK");
    }

    private static void runTest(MyTestClass myTest, Consumer<MyTestClass> testMethod) {
        myTest.setUp();
        testMethod.accept(myTest);
    }
}
