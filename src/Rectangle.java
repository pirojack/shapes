public class Rectangle implements Shapes{

    private final int width, height, colorNum;

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
