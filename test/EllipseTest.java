import org.junit.Test;

import static org.junit.Assert.*;

public class EllipseTest {

    private static Ellipse ellipseTest = new Ellipse(4,56,34);

    @Test
    public void getColor() {
        assertEquals(4,ellipseTest.getColor());
    }

    @Test
    public void area() {
        assertEquals(5981.59,ellipseTest.area(),0.2);
    }

    @Test
    public void testToString() {
        assertEquals("Object Ellipse! color: 4 axisX: 56 axisY: 34",ellipseTest.toString());
    }
}