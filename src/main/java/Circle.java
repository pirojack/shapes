import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Circle implements Shape {
    private final int radius;
    private final Color color;

    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public int getColor() {
        return color.getCode();
    }
}