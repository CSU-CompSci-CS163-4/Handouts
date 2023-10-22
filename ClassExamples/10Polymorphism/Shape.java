public class Shape {
    protected int sides;
    private String color;
    public Shape(int sides, String color) {
        this.sides = sides;
        setColor(color);
    }
    public String getColor() { return color;}
    public int getSides() {return sides;} // added from the UML
    public void setColor(String color) {this.color = color;}
    public String toString() {
                return String.format("Sides: %d, Color: %s", sides, color);
    }
}
