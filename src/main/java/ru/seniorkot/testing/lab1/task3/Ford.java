package ru.seniorkot.testing.lab1.task3;

import java.awt.Color;

public class Ford extends AbstractHuman{

    private Origin origin;
    private Hand hand;

    Ford() {
        origin = Origin.BETELGEUSE;
        hand = new Hand(null);
        hand.hold(new Bottle(Bottle.Material.GLASS, new Fish(Fish.Size.SMALL, Color.YELLOW)));
    }

    Object offerItemInTheEar() {
        return hand.item;
    }

    Origin getOrigin() {
        return origin;
    }
}
