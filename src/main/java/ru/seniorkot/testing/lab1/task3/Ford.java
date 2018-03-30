package ru.seniorkot.testing.lab1.task3;

import java.awt.Color;

public class Ford extends AbstractHuman{


    Ford() {
        origin = Origin.BETELGEUSE;
        hand[0] = new Hand(null);
        hand[1] = new Hand(null);
        hand[0].hold(new Flacon(Flacon.Material.GLASS, new Fish(Fish.Size.SMALL, Color.YELLOW)));
        offeringToPutFishInEar = true;
    }

    Origin getOrigin() {
        return origin;
    }
}
