import java.util.Random;

public class MagicCircle implements Shapes{

    private final int radius;
    private Color colEnum = randomColor();

    public MagicCircle(int radius){
        this.radius = radius;

    }

    private Color randomColor() {
        int pick = new Random().nextInt(Color.values().length);
        return Color.values()[pick];
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
    public String toString(){
        return "Object MagicCircle. Every time when it is created " +
        "it gives a new random Color!";
    }

}
