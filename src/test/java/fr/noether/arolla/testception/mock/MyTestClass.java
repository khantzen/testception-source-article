package fr.noether.arolla.testception.mock;

import fr.noether.arolla.testception.TestCase;

import java.util.function.Consumer;

public class MyTestClass extends TestCase {
    private String log;

    public MyTestClass(Consumer<MyTestClass> testMethod) {
        super(testMethod);
        this.log = "";
    }

    @Override
    public void setUp() {
        this.log = "setup";
    }

    public void thisTestMethodShouldBeSetUp() {
        this.log += " run";
    }

    public String log() {
        return this.log;
    }

    @Override
    public void tearDown() {
        this.log += " teardown";
    }
}
