import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Rectangle implements Shape {

    private final int width, height;
    private final Color color;

    public int getColor() {
        return color.getCode();
    }

    public double area() {
        return width * height;
    }

}
