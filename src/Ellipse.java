public class Ellipse implements Shapes{

    private final int colorNum,axisX,axisY;

    public Ellipse(int colorNum,int axisX,int axisY) {
        this.colorNum = colorNum;
        this.axisX = axisX;
        this.axisY = axisY;
    }

    @Override
    public int getColor() {
        return colorNum;
    }

    @Override
    public double area() {
        return axisX*axisY*Math.PI;
    }

    public String toString(){
        return "Object Ellipse! " +
                "color: " + colorNum +
                " axisX: " + axisX +
                " axisY: " + axisY;
    }

}
