package ru.seniorkot.testing.lab1.task3;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.awt.*;

public class HereTest {

    Here here;

    @Rule  public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testHereWithoutArthur() {

        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("no Arthur in Here"));

        here = new Here(new Ford(), null, new DentrassiUnderwear(),
                new SquornshellousMattress(), null,
                new Flacon(Flacon.Material.GLASS), new Fish(Fish.Size.SMALL, Color.YELLOW));

    }

    @Test
    public void testHereWithoutFord() {

        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("no Ford in Here"));

        here = new Here(null, new Arthur(), new DentrassiUnderwear(),
                new SquornshellousMattress(), null,
                new Flacon(Flacon.Material.GLASS), new Fish(Fish.Size.SMALL, Color.YELLOW));

    }


    // no need to test SquornshellousMattress as it is the same importance as DentrassiUnderwear
    @Test
    public void testHereWithoutDentrassiUnderwear() {

        here = new Here(new Ford(), new Arthur(), new DentrassiUnderwear(),
                new SquornshellousMattress(), null,
                new Flacon(Flacon.Material.GLASS), new Fish(Fish.Size.SMALL, Color.YELLOW));

        Assert.assertEquals(here.getArthur().getDetermination(), Arthur.Determination.LOW);

    }

    @Test
    public void testHereWithoutFlacon() {

        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("no Flacon in Here"));

        here = new Here(new Ford(), new Arthur(), new DentrassiUnderwear(),
                new SquornshellousMattress(), null,
                null, new Fish(Fish.Size.SMALL, Color.YELLOW));

    }

    @Test
    public void testHereWithoutFish() {

        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("implementation of AbstractHuman offers something inside Flacon but Flacon is empty"));

        here = new Here(new Ford(), new Arthur(), new DentrassiUnderwear(),
                new SquornshellousMattress(), null,
                new Flacon(Flacon.Material.GLASS), null);
    }


    @Test
    public void testHereIdeal() {
        here = new Here(new Ford(), new Arthur(), new DentrassiUnderwear(),
                new SquornshellousMattress(), null,
                new Flacon(Flacon.Material.GLASS), new Fish(Fish.Size.SMALL, Color.YELLOW));
    }




}
