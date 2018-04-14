package ru.seniorkot.testing.lab1.task3;

public class Arthur extends AbstractHuman{

    public enum Determination {
        LOW, MEDIUM, HIGH
    }

    private Determination determination;

    Arthur() {
        super(Origin.EARTH);
    }

    void lookAtFord(Ford ford) {
        if (ford != null) {
            startBlincking();
        } else throw new NullPointerException("Arthur looks at Ford but there is no Ford");
    }

    Determination getDetermination() {return determination;}

    void wantSFMCObjectAmongStuff(DentrassiUnderwear dentrassiUnderwear,
                                  SquornshellousMattress squornshellousMattress,
                                  AbstractHuman abstractHuman,
                                  CornflakesPacket cornflakesPacket) {

        /*
        if there are DentrassiUnderwear and SquornshellousMattresses and
        there is AbstractHuman whose Origin is BETELGEUSE and AbstractHuman is OfferingToPutSmallFishInEar
        and there is cornflakesPacket
         */
        if(dentrassiUnderwear != null &&
                squornshellousMattress != null &&
                abstractHuman != null &&
                abstractHuman.getOrigin() == Origin.BETELGEUSE &&
                abstractHuman.isOfferingToPutSmallFishInEar() &&
                cornflakesPacket != null){

            determination = Determination.HIGH;

        } else determination = Determination.MEDIUM;
    }

}
