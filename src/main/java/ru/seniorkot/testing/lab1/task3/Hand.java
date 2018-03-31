package ru.seniorkot.testing.lab1.task3;

public class Hand {

    private Object heldObject;

    Hand() {
        this.heldObject = null;
    }

    void setHeldObject(Object item) {
        this.heldObject = item;
    }

    Object getHeldObject() {
        return heldObject;
    }
}
