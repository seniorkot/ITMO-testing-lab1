package ru.seniorkot.testing.lab1.task3;

public class Ford extends AbstractHuman{

    Hand hand;

    Ford() {
        hand = new Hand(new Bottle("glass", new Fish("small", "yellow")));
        hand.bottle.fish.swim(true);

    }

    Fish offerFish() {
        return hand.bottle.fish;
    }

    @Override
    String getPlanet() {
        return "Betelgeuse";
    }
}
