package ru.seniorkot.testing.lab1.task3;

public class Flacon {

    public enum Material {
        PLASTIC, GLASS
    }

    private Material material;
    private Object object;

    Flacon(Material material, Object object) {
        material = material == null ? Material.GLASS : material;

        this.material = material;
        this.object = object;
    }

    Material getMaterial() {
        return material;
    }

    Object getObject() {
        return object;
    }
}
