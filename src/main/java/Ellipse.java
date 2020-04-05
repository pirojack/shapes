import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Ellipse implements Shape {

    private final Color color;
    private final int axisX, axisY;


    public int getColor() {
        return color.getCode();
    }

    public double area() {
        return axisX * axisY * Math.PI;
    }
}
