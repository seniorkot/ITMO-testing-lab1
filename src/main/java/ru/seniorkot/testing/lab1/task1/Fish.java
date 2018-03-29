package ru.seniorkot.testing.lab1.task1;

public class Fish {
    String size;
    String color;
    boolean  shimmering;

    Fish(String size, String color){
        this.size = size;
        this.color = color;
    }

    void swim (boolean shimmering) {
        this.shimmering = true;
    }
}
