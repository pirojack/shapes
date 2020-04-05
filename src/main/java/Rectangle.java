public class Rectangle implements Shape {

    private final int width, height;
    private final Color color;

    Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getColor() {
        return color.getCode();
    }

    public double area() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is the Object Rectangle!";
    }

}
