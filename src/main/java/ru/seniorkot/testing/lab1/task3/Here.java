package ru.seniorkot.testing.lab1.task3;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Here {

    private Ford ford;
    private Arthur arthur;
    private DentrassiUnderwear dentrassiUnderwear;
    private SquornshellousMattress squornshellousMattress;
    private CornflakesPacket cornflakesPacket;
    private Flacon flacon;
    private Fish fish;

    Here(Ford ford,
         Arthur arthur,
         DentrassiUnderwear dentrassiUnderwear,
         SquornshellousMattress squornshellousMattress,
         CornflakesPacket cornflakesPacket,
         Flacon flacon, Fish fish) {

        //materialize squornshellousMattress
        this.squornshellousMattress = squornshellousMattress;

        //materialize dentrassiUnderwear
        this.dentrassiUnderwear = dentrassiUnderwear;

        //materialize cornflakesPacket
        this.cornflakesPacket = cornflakesPacket;

        //materialize Flacon
        this.flacon = flacon;
        if(this.flacon == null)
            throw new NullPointerException("no Flacon in Here");

        //materialize Fish
        this.fish = fish;

        //put Fish inside Flacon
        this.flacon.setObject(this.fish);


        //materialize Ford
        this.ford = ford;
        if(this.ford == null)
            throw new NullPointerException("no Ford in Here");

        //Ford holds Flacon with small yellow fish shimmering inside
        this.ford.changeObjectInHand(this.flacon);
        //(offers to put it in Arthur's ear"
        this.ford.offerToPutSmallFishInEar();

        //materialize Arthur
        this.arthur = arthur;
        if(this.arthur == null)
            throw new NullPointerException("no Arthur in Here");

        //Arthur starts blinking and looks at Ford
        this.arthur.lookAtFord(this.ford);
        //Arthur wants to see something that extends SimpleFamiliarMentallyClingable class, cornflakesPacket for example
        this.arthur.wantSFMCObjectAmongStuff(this.dentrassiUnderwear, this.squornshellousMattress,  this.ford, this.cornflakesPacket);
    }


    public Ford getFord() {return ford;}
    public Arthur getArthur(){return arthur;}
    public DentrassiUnderwear getDentrassiUnderwear() {return dentrassiUnderwear;}
    public SquornshellousMattress getSquornshellousMattress(){return squornshellousMattress;}
    public CornflakesPacket getCornflakesPacket(){return cornflakesPacket;}
    public Flacon getFlacon(){return flacon;}
    public Fish getFish(){return fish;}

}
