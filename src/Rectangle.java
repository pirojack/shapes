public class Rectangle implements Shapes{

    private final int width, height;
    private final Color colEnum;

    Rectangle(int width, int height, Color colEnum) {
        this.width = width;
        this.height = height;
        this.colEnum = colEnum;
    }

    @Override
    public int getColor() {
        return colEnum.getCode();
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
