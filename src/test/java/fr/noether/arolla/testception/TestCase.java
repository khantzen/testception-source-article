package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class TestCase {

    protected void setUp() {}

    public void run(Consumer testMethod) {
        this.setUp();
        testMethod.accept(this);
    }
}
