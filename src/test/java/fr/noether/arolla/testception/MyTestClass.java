package fr.noether.arolla.testception;

public class MyTestClass {
    private boolean hasBeenCalled;

    public MyTestClass() {
        this.hasBeenCalled = false;
    }

    public void setUp() {

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
        return false;
    }
}
