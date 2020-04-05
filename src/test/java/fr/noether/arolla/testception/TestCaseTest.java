package fr.noether.arolla.testception;

import fr.noether.arolla.testception.mock.MyTestClass;

import java.util.function.Consumer;

public class TestCaseTest extends TestCase {
    public TestCaseTest(Consumer<TestCaseTest> testMethod) {
        super(testMethod);
    }

    public void setUp() {}

    public void testMethodShouldBeSetupBeforeRun() {
        var testMethodShouldBeSetupBeforeRun = new MyTestClass(MyTestClass::thisTestMethodShouldBeSetUp);

        testMethodShouldBeSetupBeforeRun.run();

        if (!testMethodShouldBeSetupBeforeRun.log().equals("setup run")) {
            throw new RuntimeException("Test method should have been setup before run");
        }

        System.out.println("\u001B[32mTest MethodShouldBeSetupBeforeRun : OK");
    }
}
