package ru.seniorkot.testing.lab1.task3;

public class Eyes {
    private boolean blinking;

    Eyes() {
        blinking = false;
    }

    void startBlinking() {
        blinking = true;
    }

    void stopBlinking() {
        blinking = false;
    }

    boolean getBlinking() {
        return blinking;
    }

    boolean seeObject(Object object) {
        return object == null ? false : true;
    }
}
