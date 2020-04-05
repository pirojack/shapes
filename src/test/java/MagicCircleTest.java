import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class MagicCircleTest {

    private static MagicCircle magicCircleTest = new MagicCircle(4,Color.BLUE);

    @Test
    public void getColor() {
        assertTrue(magicCircleTest.getColor() == Color.BLUE.getCode() );
        assertNotEquals(magicCircleTest.getColor(), Color.BLUE.getCode());
    }

    @Test
    public void area() {
        Assert.assertEquals(50.27,magicCircleTest.area(),0.01);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("MagicCircle{radius=4, color=BLUE}",magicCircleTest.toString());
    }
}