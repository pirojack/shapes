import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private static Square squareTest = new Square(3, Color.GREEN);

    @Test
    public void getColor() throws Exception{
        assertEquals(Color.GREEN.getCode(),squareTest.getColor());
    }

    @Test
    public void area() throws Exception{
        assertEquals(9.0,squareTest.area(),0.01);
    }

    @Test
    public void testToString() throws Exception{
        String toString = squareTest.toString();
        assertEquals("This is the Object Square!",squareTest.toString());

    }
}