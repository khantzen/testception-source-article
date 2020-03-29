package fr.noether.arolla.testception;

public class MyTestClass {
    private boolean hasBeenCalled;

    public MyTestClass() {
        this.hasBeenCalled = false;
    }

    public void thisTestMethodShouldBeCalled() {
        this.hasBeenCalled = true;
    }

    public boolean hasBeenCalled() {
        return this.hasBeenCalled;
    }
}
