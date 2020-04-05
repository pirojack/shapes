import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    private static Square squareTest = new Square(3, Color.GREEN);

    @Test
    public void getColor() throws Exception{
        Assert.assertEquals(Color.GREEN.getCode(),squareTest.getColor());
    }

    @Test
    public void area() throws Exception{
        Assert.assertEquals(9.0,squareTest.area(),0.01);
    }

    @Test
    public void testToString() throws Exception{
        String toString = squareTest.toString();
        Assert.assertEquals("This is the Object Square!",squareTest.toString());

    }
}