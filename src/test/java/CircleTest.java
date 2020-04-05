import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CircleTest {
    private Circle circle = new Circle(4, Color.BLUE);

    @Test
    public void circleColorShouldBeSameAsInstantiationColor() {

        int actualColor = circle.getColor();

        assertThat(actualColor, is(Color.BLUE.getCode()));
    }

    @Test
    public void area() {
        Assert.assertEquals(50.27, circle.area(), 0.01);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Circle(radius=4, color=2)", circle.toString());
    }
}