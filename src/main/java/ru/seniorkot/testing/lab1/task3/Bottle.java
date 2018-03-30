package ru.seniorkot.testing.lab1.task3;

public class Bottle {

    public enum Material {
        PLASTIC, GLASS
    }

    Material material;
    Fish fish;

    Bottle(Material material, Fish fish) {
        material = material == null ? Material.GLASS : material;
        //fish = fish == null ?

        this.material = material;
        this.fish = fish;
    }
}
