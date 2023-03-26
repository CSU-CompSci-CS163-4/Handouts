public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height, String color) {
        super(4, color);
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }
}