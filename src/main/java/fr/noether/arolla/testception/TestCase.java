package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class TestCase {

    private final Consumer testMethod;

    public TestCase(Consumer<? extends TestCase> testMethod) {
        this.testMethod = testMethod;
    }

    protected void setUp() {}

    protected void tearDown() {}

    public void run() {
        this.setUp();
        testMethod.accept(this);
        this.tearDown();
    }
}
