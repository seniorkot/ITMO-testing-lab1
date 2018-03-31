package ru.seniorkot.testing.lab1.task3;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.awt.*;

public class FordTest {
    private Ford ford;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Before
    public void setUp() {
        ford = new Ford();
    }


    @Test
    public void testFordOffersNothing() throws Exception{
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("implementation of AbstractHuman offers nothing"));

        ford.offerToPutSmallFishInEar();
    }

    @Test
    public void testFordOffersSomethingButNoFlacon() throws Exception{
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("implementation of AbstractHuman offers something but has no Flacon"));

        ford.changeObjectInHand(new Object());
        ford.offerToPutSmallFishInEar();
    }

    @Test
    public void testFordOffersSomethingInsideFlaconButItsEmpty() throws Exception{
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("implementation of AbstractHuman offers something inside Flacon but Flacon is empty"));

        Flacon flacon = new Flacon(Flacon.Material.GLASS);
        flacon.setObject(null);

        ford.changeObjectInHand(flacon);
        ford.offerToPutSmallFishInEar();
    }

    @Test
    public void testFordOffersSomethingInsideFlaconButNotFish() throws Exception{
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("implementation of AbstractHuman offers something inside Flacon but not a Fish"));

        Flacon flacon = new Flacon(Flacon.Material.GLASS);
        flacon.setObject(new Object());

        ford.changeObjectInHand(flacon);
        ford.offerToPutSmallFishInEar();
    }

    @Test
    public void testFordOffersFishInsideFlaconButFishNotSmall() throws Exception{
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage(
                CoreMatchers.equalTo("implementation of AbstractHuman offers a Fish inside Flacon but Fish not SMALL"));

        Flacon flacon = new Flacon(Flacon.Material.GLASS);
        flacon.setObject(new Fish(Fish.Size.BIG, Color.BLACK));

        ford.changeObjectInHand(flacon);
        ford.offerToPutSmallFishInEar();
    }

    @Test
    public void testFordOffersFishInEar() throws Exception{
        Flacon flacon = new Flacon(Flacon.Material.GLASS);
        flacon.setObject(new Fish(Fish.Size.SMALL, Color.BLACK));

        ford.changeObjectInHand(flacon);
        ford.offerToPutSmallFishInEar();

        Assert.assertTrue(ford.isOfferingToPutSmallFishInEar());
    }



}
