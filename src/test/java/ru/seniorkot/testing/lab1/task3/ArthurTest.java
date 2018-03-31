package ru.seniorkot.testing.lab1.task3;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.awt.*;

public class ArthurTest {
    private Arthur arthur;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        arthur = new Arthur();
    }

    @Test
    public void testArthurLooksAtFordButThereIsNoFord() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("Arthur looks at Ford but there is no Ford"));

        arthur.lookAtFord(null);
    }

    @Test
    public void testArthurLooksAtFord() {
        Ford ford = new Ford();
        arthur.lookAtFord(ford);

        Assert.assertTrue(arthur.isBlinking());
    }


    @Test
    public void testArthurwantSFMCObjectAmongStuffRightOffer() {
        //materialize Flacon
        Flacon flacon = new Flacon(Flacon.Material.GLASS);

        //put Fish inside Flacon
        flacon.setObject(new Fish(Fish.Size.SMALL, Color.YELLOW));

        Ford ford = new Ford();
        ford.changeObjectInHand(flacon);
        ford.offerToPutSmallFishInEar();

        arthur.wantSFMCObjectAmongStuff(new DentrassiUnderwear(), new SquornshellousMattress(),
                ford, new CornflakesPacket());

        Assert.assertEquals(arthur.getDetermination(), Arthur.Determination.HIGH);
    }

    @Test
    public void testArthurwantSFMCObjectAmongStuffBadOffer() {
        arthur.wantSFMCObjectAmongStuff(new DentrassiUnderwear(), new SquornshellousMattress(),
                new Ford(), null);

        Assert.assertEquals(arthur.getDetermination(), Arthur.Determination.LOW);
    }

    @Test
    public void testArthurwantSFMCObjectAmongStuffNothing() {
        arthur.wantSFMCObjectAmongStuff(null, null,
                null, null);

        Assert.assertEquals(arthur.getDetermination(), Arthur.Determination.LOW);
    }



}
