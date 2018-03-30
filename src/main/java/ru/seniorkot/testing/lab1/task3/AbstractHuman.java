package ru.seniorkot.testing.lab1.task3;

import java.util.ArrayList;

abstract public class AbstractHuman {
    public enum Origin{
        BETELGEUSE, EARTH
    }

    Origin origin;
    Hand[] hand;
}
