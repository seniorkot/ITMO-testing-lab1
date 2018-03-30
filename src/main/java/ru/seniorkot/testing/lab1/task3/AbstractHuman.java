package ru.seniorkot.testing.lab1.task3;

abstract public class AbstractHuman {
    public enum Origin{
        BETELGEUSE, EARTH
    }

    protected Origin origin;
    Hand[] hand;
    protected boolean offeringToPutSmallFishInEar;

    void offerToPutSmallFishInEar() {

        //if AbstractHuman is holding a Flacon
        if(hand != null && hand[0].getHeldObject() != null && hand[0].getHeldObject().getClass() == Flacon.class) {
            Flacon flacon = (Flacon)hand[0].getHeldObject();

            //if Flacon exists and contains a Fish
            if (flacon.getObject() != null && flacon.getObject().getClass() == Fish.class) {
                Fish fish = (Fish)flacon.getObject();

                //if Fish is SMALL
                if (fish.size == Fish.Size.SMALL) {
                    offeringToPutSmallFishInEar = true;
                } else throw new IllegalStateException("Fish is not Size.SMALL");
            } else throw new NullPointerException("no Fish found");
        } else throw new NullPointerException("no hands or no object or this object is not Flacon");
     }


    Origin getOrigin() {
        return origin;
    }

}
