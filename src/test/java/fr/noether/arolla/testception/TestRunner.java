package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        new ToBeNamed(ToBeNamed::testMethodShouldBeRun).run();
        new ToBeNamed(ToBeNamed::testMethodShouldBeSetup).run();
    }

}
