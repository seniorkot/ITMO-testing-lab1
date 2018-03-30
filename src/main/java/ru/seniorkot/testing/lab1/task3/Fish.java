package ru.seniorkot.testing.lab1.task3;

import java.awt.*;

public class Fish {

    public enum Size {
        SMALL, MODERATE, BIG
    }

    Size size;
    Color color;
    boolean  shimmering;

    Fish(Size size, Color color){
        this.size = size == null ? Size.SMALL : size;
        this.color = color == null ? Color.YELLOW : color;
        swim();
    }

    private void swim() {
        this.shimmering = true;
    }
}
