package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        new TestCaseTest(TestCaseTest::testMethodShouldRespectTestTemplate).run();
    }

}
