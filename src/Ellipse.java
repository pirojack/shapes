public class Ellipse implements Shapes{

    private final int axisX,axisY;
    private final Color colEnum;

    public Ellipse(Color colEnum,int axisX,int axisY) {
        this.colEnum = colEnum;
        this.axisX = axisX;
        this.axisY = axisY;
    }

    @Override
    public int getColor() {
        return colEnum.getCode();
    }

    @Override
    public double area() {
        return axisX*axisY*Math.PI;
    }

    public String toString(){
        return "Object Ellipse! " +
                "color: " + colEnum +
                " axisX: " + axisX +
                " axisY: " + axisY;
    }

}
