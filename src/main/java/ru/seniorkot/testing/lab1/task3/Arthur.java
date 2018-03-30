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
        //if there are DentrassiUnderwear and SquornshellousMattresses
        if(!here.getAllDentrassiUnderwear().isEmpty() && !here.getAllSquornshellousMattresses().isEmpty()){

            //if BetelgeuseHuman exists and is holding a Flacon
            if(here.getBetelgeuseHuman().hand[0].heldObject != null &&
                    here.getBetelgeuseHuman().hand[0].heldObject.getClass() == Flacon.class) {
                Flacon flacon = (Flacon)here.getBetelgeuseHuman().hand[0].heldObject;

                //if Flacon exists and contains a Fish
                if (flacon.object != null && flacon.object.getClass() == Fish.class) {
                    Fish fish = (Fish)flacon.object;

                    //if Fish is SMALL and BetelgeuseHuman is offeringToPutFishInEar and Arthur sees CornflackesPacket
                    if (fish.size == Fish.Size.SMALL &&
                            here.getBetelgeuseHuman().offeringToPutFishInEar &&
                            eyes.seeObject(here.getCornflakesPacket())) {
                        //then feelDetermined()
                        feelDetermined();
                    }
                }
            }
        }
    }

}
