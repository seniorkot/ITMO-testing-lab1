package ru.seniorkot.testing.lab1.task3;

public class Flacon {

    public enum Material {
        PLASTIC, GLASS
    }

    private Material material;
    private Object object;

    Flacon() {
        material = Material.GLASS;
        object = null;
    }

    Flacon(Material material) {
        material = material == null ? Material.GLASS : material;
        object = null;
        this.material = material;
    }

    void setObject(Object object) {
        this.object = object;
    }

    Material getMaterial() {
        return material;
    }

    Object getObject() {
        return object;
    }
}
