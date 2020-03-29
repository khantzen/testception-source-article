package fr.noether.arolla.testception;

import fr.noether.arolla.testception.MyTestClass;

public class ToBeNamed {
    public static void testMethodShouldBeRun() {
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
