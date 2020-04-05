import lombok.ToString;

@ToString
public class Square extends Rectangle {

    private final int width;
    private final Color color;

    Square(int width, Color color) {
        super(width, width, color);
        this.width = width;
        this.color = color;
    }

    public int getColor() {
        return color.getCode();
    }

    public double area() {
        return width * width;
    }

}
