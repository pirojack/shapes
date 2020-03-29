import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private static Rectangle rectangleTest = new Rectangle(2,4, Color.RED);

    @Test
    public void getColor() {
        assertEquals(Color.RED.getCode(),rectangleTest.getColor());
    }

    @Test
    public void area() {
        assertEquals(8.0,rectangleTest.area(),0.01);
    }

    @Test
    public void testToString() {
        assertEquals("This is the Object Rectangle!",rectangleTest.toString());
    }
}