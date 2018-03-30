package ru.seniorkot.testing.lab1.task3;

public class Hand {

    public Object item;

    Hand(Object item) {
        this.item = null;
    }

    public void hold(Object item) {
        this.item = item;
    }
}
