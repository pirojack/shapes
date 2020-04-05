import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private static Rectangle rectangleTest = new Rectangle(2,4, Color.RED);

    @Test
    public void getColor() {
        Assert.assertEquals(Color.RED.getCode(),rectangleTest.getColor());
    }

    @Test
    public void area() {
        Assert.assertEquals(8.0,rectangleTest.area(),0.01);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("This is the Object Rectangle!",rectangleTest.toString());
    }
}