package ru.seniorkot.testing.lab1.task3;

public class Arthur {

    public enum Determination {
        LOW, HIGH
    }

    Eyes eyes;
    private Determination determination;

    Arthur() {
        eyes = new Eyes();
        determination = Determination.LOW;
    }

    void lookAtFord(boolean blinking) {
        eyes.startBlinking();
    }


    void feelDetermined() {
        determination = Determination.HIGH;
    }

    Determination getDetermination() {return determination;}

    void wantSFMCObjectAmongStuff(Here here) {
        //if there are DentrassiUnderwear and SquornshellousMattresses
        if(!here.getAllDentrassiUnderwear().isEmpty() && !here.getAllSquornshellousMattresses().isEmpty()){

            //if BetelgeuseHuman exists and is holding a Flacon
            if(here.getBetelgeuseHuman().hand[0].getHeldObject() != null &&
                    here.getBetelgeuseHuman().hand[0].getHeldObject().getClass() == Flacon.class) {
                Flacon flacon = (Flacon)here.getBetelgeuseHuman().hand[0].getHeldObject();

                //if Flacon exists and contains a Fish
                if (flacon.getObject() != null && flacon.getObject().getClass() == Fish.class) {
                    Fish fish = (Fish)flacon.getObject();

                    //if Fish is SMALL and BetelgeuseHuman is offeringToPutSmallFishInEar and Arthur sees CornflackesPacket
                    if (fish.size == Fish.Size.SMALL &&
                            here.getBetelgeuseHuman().offeringToPutSmallFishInEar &&
                            eyes.seeObject(here.getCornflakesPacket())) {
                        //then feelDetermined()
                        feelDetermined();
                    }
                }
            }
        }
    }

}
