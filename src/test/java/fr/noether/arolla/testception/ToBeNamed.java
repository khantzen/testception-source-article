package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class ToBeNamed extends TestCase {
    public ToBeNamed(Consumer<ToBeNamed> testMethod) {
        super(testMethod);
    }

    public void setUp() {}

    public void testMethodShouldBeRun() {
        var testMethodShouldBeCalled = new MyTestClass(MyTestClass::thisTestMethodShouldBeCalled);

        if (testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have not been called yet.");
        }

        testMethodShouldBeCalled.run();

        if (!testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have been called.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeCalled : OK");
    }

    public void testMethodShouldBeSetup() {
        var testMethodShouldBeSetup = new MyTestClass(MyTestClass::thisTestMethodShouldBeSetUp);

        if(testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have not been setup yet.");
        }

        testMethodShouldBeSetup.run();

        if (!testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have been setup.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeSetup : OK");
    }
}
