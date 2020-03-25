public class Circle implements Shapes {

    private final int radius, colorNum;

    public Circle(int radius, int colorNum) {
        this.radius = radius;
        this.colorNum = colorNum;
    }

    @Override
    public int getColor() {
        return colorNum;
    }

    @Override
    public double area() {
        return (radius^2)*Math.PI;
    }

    @Override
    public String toString() {
        return "This is the Object Circle!";
    }
}
