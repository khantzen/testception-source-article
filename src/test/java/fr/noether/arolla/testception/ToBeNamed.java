package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class ToBeNamed extends TestCase {
    public void setUp() {}

    public void testMethodShouldBeRun() {
        var testMethodShouldBeCalled = new MyTestClass();

        if (testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have not been called yet.");
        }

        Consumer<MyTestClass> thisTestMethodShouldBeCalled = MyTestClass::thisTestMethodShouldBeCalled;

        testMethodShouldBeCalled.run(thisTestMethodShouldBeCalled);

        if (!testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have been called.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeCalled : OK");
    }

    public void testMethodShouldBeSetup() {
        var testMethodShouldBeSetup = new MyTestClass();

        if(testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have not been setup yet.");
        }

        Consumer<MyTestClass> thisTestMethodShouldBeSetUp = MyTestClass::thisTestMethodShouldBeSetUp;
        testMethodShouldBeSetup.run(thisTestMethodShouldBeSetUp);

        if (!testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have been setup.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeSetup : OK");
    }
}
