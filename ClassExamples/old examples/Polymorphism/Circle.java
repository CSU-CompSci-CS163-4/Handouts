package Polymorphism;

public class Circle extends AbstractShape implements HasColor {
    private int radius;
    private String color;
    public Circle(int radius, String color) {
        super(1);
        this.radius = radius;
        setColor(color);

    }
    @Override
    public void setColor(String color) {
       this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return radius * Math.PI;
    }
    
}
