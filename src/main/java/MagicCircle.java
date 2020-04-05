import java.util.Random;

public class MagicCircle implements Shape {

    private final int radius;
    private Color color;
    private int instanceCount;

    public MagicCircle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    private boolean isGetColorIsSecond() {
        return instanceCount % 2 == 0;
    }

    private Color randomColor() {
        int pick;
        do {
            pick = new Random().nextInt(Color.values().length);
        } while (Color.values()[pick] == color);

        return Color.values()[pick];
    }

    public int getColor() {
        instanceCount++;
        if (isGetColorIsSecond()) this.color = randomColor();
        return color.getCode();
    }

    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "MagicCircle{" +
                "radius=" + radius +
                ", color=" + color +
                '}';
    }
}
