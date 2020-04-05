package fr.noether.arolla.testception.mock;

import fr.noether.arolla.testception.TestCase;

import java.util.function.Consumer;

public class MyTestClass extends TestCase {
    private boolean hasBeenCalled;
    private boolean setUp;

    public MyTestClass(Consumer<MyTestClass> testMethod) {
        super(testMethod);
        this.hasBeenCalled = false;
        this.setUp = false;
    }

    @Override
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

    public String log() {
        return "null";
    }
}
