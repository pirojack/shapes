import java.util.List;

public class ColorAvg {

    static List<Shape> shapes;

    public static void main(String[] args) {

        fillShape();

        double redAvg = 0.0;
        double greenAvg = 0.0;
        double blueAvg = 0.0;
        double changingAvg = 0.0;

        int redcount = 0;
        int greencount = 0;
        int bluecount = 0;
        int changecount = 0;

        for (Shape shape : shapes) {

            if (shape instanceof MagicCircle) {
                changecount++;
                changingAvg += shape.area();
                continue;
            }
            if (shape.getColor() == Color.RED.getCode()) {
                redcount++;
                redAvg += shape.area();
            }
            if (shape.getColor() == Color.GREEN.getCode()) {
                greencount++;
                greenAvg += shape.area();
            }
            if (shape.getColor() == Color.BLUE.getCode()) {
                bluecount++;
                blueAvg += shape.area();
            }

        }

        redAvg = redAvg / redcount;
        greenAvg = greenAvg / greencount;
        blueAvg = blueAvg / bluecount;
        changingAvg = changingAvg / changecount;

        System.out.println("Red: " + redAvg);
        System.out.println("Green: " + greenAvg);
        System.out.println("Blue: " + blueAvg);
        System.out.println("Changing: " + changingAvg);

    }

    public static void fillShape() {
        shapes = List.of(
                new Square(1, Color.RED),
                new Square(2, Color.RED),
                new Square(3, Color.RED),
                new Square(4, Color.GREEN),
                new Square(5, Color.GREEN),
                new Square(6, Color.RED),
                new Square(7, Color.BLUE),
                new MagicCircle(9, Color.GREEN),
                new MagicCircle(3, Color.RED),
                new MagicCircle(4, Color.BLUE),
                new MagicCircle(5, Color.BLUE),
                new MagicCircle(6, Color.RED),
                new MagicCircle(9, Color.GREEN),
                new Rectangle(2, 6, Color.BLUE),
                new Rectangle(4, 3, Color.RED),
                new Rectangle(6, 5, Color.GREEN),
                new Rectangle(6, 3, Color.GREEN),
                new Rectangle(7, 7, Color.BLUE),
                new Ellipse(Color.GREEN, 5, 6),
                new Ellipse(Color.RED, 5, 6),
                new Ellipse(Color.BLUE, 5, 6),
                new Ellipse(Color.GREEN, 5, 6),
                new Circle(7, Color.BLUE),
                new Circle(7, Color.RED),
                new Circle(7, Color.GREEN),
                new Circle(7, Color.BLUE)
        );

    }

}
