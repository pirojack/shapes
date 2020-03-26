import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private static Circle circleTest = new Circle(4,2);

    @Test
    public void getColor() {
        assertEquals(2,2);
    }

    @Test
    public void area() {
        assertEquals(50.27,circleTest.area(),0.01);
    }

    @Test
    public void testToString() {
        assertEquals("This is the Object Circle!",circleTest.toString());
    }
}