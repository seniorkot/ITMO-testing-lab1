package ru.seniorkot.testing.lab1.task3;

public class Flacon {

    public enum Material {
        PLASTIC, GLASS
    }

    Material material;
    Object object;

    Flacon(Material material, Object object) {
        material = material == null ? Material.GLASS : material;

        this.material = material;
        this.object = object;
    }
}
