package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        var myTest = new MyTestClass();

        if (myTest.hasBeenCalled()) {
            throw new RuntimeException("Test method should have not been called yet.");
        }

        myTest.thisTestMethodShouldBeCalled();

        if (!myTest.hasBeenCalled()) {
            throw new RuntimeException("Test method should have been called.");
        }

        System.out.println("\u001B[32mTest OK");
    }
}
