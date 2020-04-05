package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class TestCase {

    private final Consumer testMethod;

    public TestCase(Consumer<? extends TestCase> testMethod) {
        this.testMethod = testMethod;
    }

    protected void setUp() {}

    public void run() {
        testMethod.accept(this);
        this.setUp();
    }
}
