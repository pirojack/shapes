import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EllipseTest {

    private static Ellipse ellipseTest = new Ellipse(Color.GREEN,56,34);

    @Test
    public void getColor() {
        Assert.assertEquals(Color.GREEN.getCode(),ellipseTest.getColor());
    }

    @Test
    public void area() {
        Assert.assertEquals(5981.59,ellipseTest.area(),0.2);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Object Ellipse! color: 4 axisX: 56 axisY: 34",ellipseTest.toString());
    }
}