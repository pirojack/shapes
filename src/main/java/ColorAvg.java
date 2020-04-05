import java.util.List;

public class ColorAvg {

    static List<Shape> shapes;

    static Circle circle0 = new Circle(3, Color.GREEN);
    static Circle circle1 = new Circle(2, Color.RED);
    static Circle circle3 = new Circle(5, Color.GREEN);
    static Circle circle4 = new Circle(9, Color.BLUE);

    static Ellipse ellipse1 = new Ellipse(Color.BLUE, 5, 6);
    static Ellipse ellipse2 = new Ellipse(Color.RED, 4, 6);
    static Ellipse ellipse3 = new Ellipse(Color.GREEN, 3, 6);
    static Ellipse ellipse4 = new Ellipse(Color.RED, 5, 5);

    static MagicCircle magicCircle0 = new MagicCircle(6);
    static MagicCircle magicCircle3 = new MagicCircle(7);
    static MagicCircle magicCircle4 = new MagicCircle(1);

    static Rectangle rectangle0 = new Rectangle(4, 6, Color.GREEN);
    static Rectangle rectangle1 = new Rectangle(7, 3, Color.RED);
    static Rectangle rectangle2 = new Rectangle(4, 8, Color.RED);
    static Rectangle rectangle4 = new Rectangle(2, 5, Color.BLUE);

    static Square square0 = new Square(5, Color.RED);
    static Square square1 = new Square(3, Color.GREEN);
    static Square square4 = new Square(1, Color.BLUE);


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
                new Square(8, Color.RED),
                new MagicCircle(9),
                new Rectangle(6, 5, Color.BLUE),
                new Ellipse(Color.GREEN, 5, 6),
                new Circle(7, Color.BLUE),
                new Square(3, Color.BLUE),
                new MagicCircle(2),
                rectangle4,
                ellipse1,
                circle3,
                square4,
                magicCircle3,
                rectangle0,
                ellipse2,
                circle4,
                square0,
                magicCircle4,
                rectangle1,
                ellipse3,
                circle0,
                square1,
                magicCircle0,
                rectangle2,
                ellipse4,
                circle1
        );

//        shapes.add(square2);
//        shapes.add(magicCircle1);
//        shapes.add(rectangle3);
//        shapes.add(ellipse0);
//        shapes.add(circle2);
//
//        shapes.add(square3);
//        shapes.add(magicCircle2);
//        shapes.add(rectangle4);
//        shapes.add(ellipse1);
//        shapes.add(circle3);
//
//        shapes.add(square4);
//        shapes.add(magicCircle3);
//        shapes.add(rectangle0);
//        shapes.add(ellipse2);
//        shapes.add(circle4);
//
//        shapes.add(square0);
//        shapes.add(magicCircle4);
//        shapes.add(rectangle1);
//        shapes.add(ellipse3);
//        shapes.add(circle0);
//
//        shapes.add(square1);
//        shapes.add(magicCircle0);
//        shapes.add(rectangle2);
//        shapes.add(ellipse4);
//        shapes.add(circle1);
    }

}
