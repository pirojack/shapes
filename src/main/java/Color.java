import lombok.AllArgsConstructor;

@AllArgsConstructor
enum Color {

    RED(0, "RED"),
    GREEN(1, "GREEN"),
    BLUE(2, "BLUE");

    private final int code;
    private final String color;

    public String getColor() {
        return this.color;
    }

    public int getCode() {
        return this.code;
    }

}