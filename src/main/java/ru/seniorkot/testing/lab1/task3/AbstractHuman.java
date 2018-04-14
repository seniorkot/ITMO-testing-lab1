package ru.seniorkot.testing.lab1.task3;

abstract public class AbstractHuman {
    public enum Origin{
        BETELGEUSE, EARTH
    }

    private Origin origin;
    private Eyes eyes;
    private Hand[] hands;
    private boolean offeringToPutSmallFishInEar;

    /*
    origin and hands must not be changed after class extending AbstractHuman instantiated
    so this constructor will be called through "super.(Origin origin)" in child class to set them
     */
    AbstractHuman(Origin origin) {
        eyes = new Eyes();

        hands = new Hand[2];
        hands[0] = new Hand();
        hands[1] = new Hand();

        this.origin = origin;
        offeringToPutSmallFishInEar = false;
    }

    void changeObjectInHand(Object object) {
        hands[0].setHeldObject(object);
    }

    void startBlincking() {
        eyes.startBlinking();
    }

    boolean isOfferingToPutSmallFishInEar() {
        return offeringToPutSmallFishInEar;
    }

    boolean isBlinking() {return eyes.getBlinking();}

    Origin getOrigin() {
        return origin;
    }

    Object getHeldObject() {return hands[0].getHeldObject();}

    void offerToPutSmallFishInEar() {

        //if AbstractHuman is holding something
        if(hands[0].getHeldObject() != null) {

            //if AbstractHuman is holding Flacon
            if(hands[0].getHeldObject().getClass() == Flacon.class) {
                Flacon flacon = (Flacon)hands[0].getHeldObject();

                //if Flacon contains something
                if(flacon.getObject() != null) {

                    //if Flacon contains a Fish
                    if(flacon.getObject().getClass() == Fish.class) {
                        Fish fish = (Fish)flacon.getObject();

                        //if Fish.Size is SMALL
                        if(fish.getSize() == Fish.Size.SMALL) {
                            offeringToPutSmallFishInEar = true;
                        } else throw new IllegalStateException("implementation of AbstractHuman offers a Fish inside Flacon but Fish not SMALL");
                    } else throw new IllegalStateException("implementation of AbstractHuman offers something inside Flacon but not a Fish");
                } else throw new NullPointerException("implementation of AbstractHuman offers something inside Flacon but Flacon is empty");
            } else throw new IllegalStateException("implementation of AbstractHuman offers something but has no Flacon");
        } else throw new NullPointerException("implementation of AbstractHuman offers nothing");
     }



}
