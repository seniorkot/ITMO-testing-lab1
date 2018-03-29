package ru.seniorkot.testing.lab1.task1;

public class Arthur {

    Eyes eyes;

    Arthur() {
        eyes = new Eyes();
    }

    void lookAtFord() {
        eyes.blinking = true;
    }

    void feelMoreDetermined() {

    }

    void wantSFMCObject() {

    }

    boolean checkIfObjectSFMC(Object object) {
        //check if passed object inherited from SimpleFamiliarMentallyClingable class with reflection
        return object.getClass().isAssignableFrom(SimpleFamiliarMentallyClingable.class);
    }

}
