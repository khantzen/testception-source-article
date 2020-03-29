package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class TestRunner {

    public static void main(String[] args) {
        var testRunner = new ToBeNamed();
        Consumer<ToBeNamed> testMethodShouldBeRun = ToBeNamed::testMethodShouldBeRun;
        testRunner.run(testMethodShouldBeRun);
        Consumer<ToBeNamed> testMethodShouldBeSetup = ToBeNamed::testMethodShouldBeSetup;
        testRunner.run(testMethodShouldBeSetup);
    }

}
