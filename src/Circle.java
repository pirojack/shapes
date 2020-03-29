public class Circle implements Shapes {

    private final int radius;
    private final Color colEnum;

    public Circle(int radius, Color colEnum) {
        this.radius = radius;
        this.colEnum = colEnum;
        ;
    }

    @Override
    public int getColor() {
        return colEnum.getCode();
    }

    @Override
    public double area() {
        return (Math.pow(radius,2))*Math.PI;
    }

    @Override
    public String toString() {
        return "This is the Object Circle!";
    }
}
