package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        testMethodShouldBeRun();
        testMethodShouldBeSetup();
    }

    private static void testMethodShouldBeSetup() {
        var testMethodShouldBeSetup = new MyTestClass();

        if(testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have not been setup yet.");
        }

        testMethodShouldBeSetup.run(MyTestClass::thisTestMethodShouldBeSetUp);

        if (!testMethodShouldBeSetup.hasBeenSetUp()) {
            throw new RuntimeException("Test Method should have been setup.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeSetup : OK");
    }

    private static void testMethodShouldBeRun() {
        var testMethodShouldBeCalled = new MyTestClass();

        if (testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have not been called yet.");
        }

        testMethodShouldBeCalled.run(MyTestClass::thisTestMethodShouldBeCalled);

        if (!testMethodShouldBeCalled.hasBeenCalled()) {
            throw new RuntimeException("Test method should have been called.");
        }

        System.out.println("\u001B[32mTest MethodShouldBeCalled : OK");
    }

}
