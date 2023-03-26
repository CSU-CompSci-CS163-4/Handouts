public class Circle extends Shape {
    private int radius;
    public Circle(int radius, String color) {
        super(1, color);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public int getDiameter() { return radius * 2;} // this was added at the end of the lecture, so not part of diagram
}