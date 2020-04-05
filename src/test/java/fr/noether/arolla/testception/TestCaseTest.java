package fr.noether.arolla.testception;

import fr.noether.arolla.testception.mock.MyTestClass;

import java.util.function.Consumer;

public class TestCaseTest extends TestCase {
    public TestCaseTest(Consumer<TestCaseTest> testMethod) {
        super(testMethod);
    }

    public void setUp() {}


    public void testMethodShouldBeTearDownAfterRun() {
        var testMethodShouldBeSetupBeforeRun = new MyTestClass(MyTestClass::thisTestMethodShouldBeSetUp);

        testMethodShouldBeSetupBeforeRun.run();

        if (!testMethodShouldBeSetupBeforeRun.log().equals("setup run teardown")) {
            throw new RuntimeException("Test method should have been teardown after run");
        }

        System.out.println("\u001B[32mTest MethodShouldBeTearDownAfterRun : OK");
    }
}
