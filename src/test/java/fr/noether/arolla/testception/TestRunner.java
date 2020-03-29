package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        new TestCaseTest(TestCaseTest::testMethodShouldBeRun).run();
        new TestCaseTest(TestCaseTest::testMethodShouldBeSetup).run();
    }

}
