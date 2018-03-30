package ru.seniorkot.testing.lab1.task3;

import java.util.ArrayList;

public class Here {
    private AbstractHuman betelgeuseHuman;
    private Arthur arthur;
    private ArrayList<DentrassiUnderwear> allDentrassiUnderwear;
    private ArrayList<SquornshellousMattress> allSquornshellousMattresses;
    private CornflakesPacket cornflakesPacket;

    Here() {

        allDentrassiUnderwear.add(new DentrassiUnderwear());
        allDentrassiUnderwear.add(new DentrassiUnderwear());

        //mattrasses are plural in text thus there is more than one
        allSquornshellousMattresses.add(new SquornshellousMattress());
        allSquornshellousMattresses.add(new SquornshellousMattress());

        cornflakesPacket = null;

        //materialize Ford
        betelgeuseHuman = new Ford();

        //materialize Arthur
        arthur = new Arthur();
        arthur.lookAtFord(true);
    }

    AbstractHuman getBetelgeuseHuman() {return betelgeuseHuman;}
    Arthur getArthur() {return arthur;}
    ArrayList<DentrassiUnderwear> getAllDentrassiUnderwear() {return allDentrassiUnderwear;}
    ArrayList<SquornshellousMattress> getAllSquornshellousMattresses() {return allSquornshellousMattresses;}
    CornflakesPacket getCornflakesPacket() {return cornflakesPacket;}

}
