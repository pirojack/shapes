import org.junit.Test;

import static org.junit.Assert.*;

public class MagicCircleTest {

    private static MagicCircle magicCircleTest = new MagicCircle(45);

    @Test
    public void getColor() {
        assertEquals(Color.RED.getCode(),magicCircleTest.getColor());
    }

    @Test
    public void area() {
    }

    @Test
    public void testToString() {
    }
}