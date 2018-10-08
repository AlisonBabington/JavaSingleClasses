//Create a water bottle class with a volume property.
////        The volume should start at 100.
////        Add a drink function that takes 10 from the volume each time it is called.
////        Create an empty function that brings the volume down to 0.
////        Create a fill function that fills the volume back to 100.

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }
}
