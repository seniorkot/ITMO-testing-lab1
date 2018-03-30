package ru.seniorkot.testing.lab1.task3;

import java.awt.*;

public class Fish {

    public enum Size {
        SMALL, MODERATE, BIG
    }

    Size size;
    Color color;
    boolean  shimmering;


    Fish() {
        this.size = Size.SMALL;
        this.color = Color.YELLOW;
        swim();
    }

    Fish(Size size, Color color){
        this.size = size == null ? Size.SMALL : size;
        this.color = color == null ? Color.YELLOW : color;
        swim();
    }

    Size getSize() {
        return size;
    }

    Color getColor() {
        return color;
    }

    private void swim() {
        this.shimmering = true;
    }
}
