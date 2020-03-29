package fr.noether.arolla.testception;

public class TestRunner {

    public static void main(String[] args) {
        var assertion = 1 != 2;
        if (!assertion) {
            throw new RuntimeException("Invalid assertion");
        }

        System.out.println("Test OK");
    }
}
