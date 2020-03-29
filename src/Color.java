import java.util.Random;

enum Color {

    RED(0, "RED"),
    GREEN(1, "GREEN"),
    BLUE(2, "BLUE");

    private final int code;
    private final String color;

    Color(int code, String color) {
        this.code = code;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public int getCode() {
        return this.code;
    }

}