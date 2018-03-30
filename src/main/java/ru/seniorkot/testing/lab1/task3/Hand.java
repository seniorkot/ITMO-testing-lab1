package ru.seniorkot.testing.lab1.task3;

public class Hand {

    public Object heldObject;

    Hand(Object item) {
        this.heldObject = null;
    }

    public void hold(Object item) {
        this.heldObject = item;
    }
}
