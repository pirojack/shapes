public class Square implements Shapes{

    private final int width, colorNum;

    Square(int width, int colorNum){
        this.width =  width;
        this.colorNum = colorNum;
    }

    @Override
    public int getColor() {
        return colorNum;
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
