public class Square implements Shapes{

    private final int width;
    private final Color colEnum;

    Square(int width, Color colEnum){
        this.width =  width;
        this.colEnum = colEnum;
    }

    @Override
    public int getColor() {
        return colEnum.getCode();
    }

    @Override
    public double area() {
        return width*width;
    }

    @Override
    public String toString() {
        return "This is the Object Square!";
    }

}
