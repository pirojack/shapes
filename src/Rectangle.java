public class Rectangle implements Shapes{

    private final int width, height, colorNum;
    private String color = COLORS[getColor()];

    Rectangle(int width, int height, int colorNum) {
        this.width = width;
        this.height = height;
        this.colorNum = colorNum;
    }

    @Override
    public int getColor() {
        return colorNum;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public String toString() {
        return "This is the Object Rectangle!";
    }
}
