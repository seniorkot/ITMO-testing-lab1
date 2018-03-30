package ru.seniorkot.testing.lab1.task3;

public class Arthur {

    public enum Determination {
        LOW, HIGH
    }

    Eyes eyes;
    Determination determination;

    Arthur() {
        eyes = new Eyes();
        determination = Determination.LOW;
    }

    void lookAtFord(boolean blinking) {
        eyes.blinking = blinking;
    }

    void feelDetermined() {
        determination = Determination.HIGH;
    }

    void wantSFMCObjectAmongStuff(Here here) {
        if(!here.getAllDentrassiUnderwear().isEmpty() && !here.getAllSquornshellousMattresses().isEmpty()){

            if(here.getBetelgeuseHuman().hand[0].object != null &&
                    here.getBetelgeuseHuman().hand[0].object.getClass() == Flacon.class) {
                Flacon flacon = (Flacon)here.getBetelgeuseHuman().hand[0].object;

                if (flacon.object != null && flacon.object.getClass() == Fish.class) {
                    
                }
            }
        }
    }

}
