package ru.seniorkot.testing.lab1.task3;

public class Hand {

    public Object object;

    Hand(Object item) {
        this.object = null;
    }

    public void hold(Object item) {
        this.object = item;
    }
}
