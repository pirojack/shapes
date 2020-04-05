import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MagicCircleTest {

    private static MagicCircle magicCircleTest = new MagicCircle(4);

    @Test
    public void getColor() {
        assertTrue(magicCircleTest.getColor() == Color.RED.getCode()
                    || magicCircleTest.getColor() == Color.BLUE.getCode()
                    || magicCircleTest.getColor() == Color.GREEN.getCode());
    }

    @Test
    public void area() {
        Assert.assertEquals(50.27,magicCircleTest.area(),0.01);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Object MagicCircle. Every time when it is created it gives a new random Color!",magicCircleTest.toString());
    }
}