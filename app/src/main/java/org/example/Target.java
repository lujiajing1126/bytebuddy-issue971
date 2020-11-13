package org.example;

public class Target {
    @Timed
    public void call() {
        System.out.println("called");
    }
}
