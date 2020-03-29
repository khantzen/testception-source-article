package fr.noether.arolla.testception;

import java.util.function.Consumer;

public class MyTestClass {
    private boolean hasBeenCalled;
    private boolean setUp;

    public MyTestClass() {
        this.hasBeenCalled = false;
        this.setUp = false;
    }

    public void run(Consumer<MyTestClass> testMethod) {
        this.setUp();
        testMethod.accept(this);
    }

    public void setUp() {
        this.setUp = true;
    }

    public void thisTestMethodShouldBeCalled() {
        this.hasBeenCalled = true;
    }

    public void thisTestMethodShouldBeSetUp() {

    }

    public boolean hasBeenCalled() {
        return this.hasBeenCalled;
    }

    public boolean hasBeenSetUp() {
        return this.setUp;
    }
}
