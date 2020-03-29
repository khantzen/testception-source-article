package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        var testRunner = new ToBeNamed();
        testRunner.run(ToBeNamed::testMethodShouldBeRun);
        testRunner.run(ToBeNamed::testMethodShouldBeSetup);
    }

}
