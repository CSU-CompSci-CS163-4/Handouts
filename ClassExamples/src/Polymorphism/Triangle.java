package Polymorphism;

public class Triangle extends AbstractShape implements HasWidthHeight, HasColor {
    private int width;
    private int height;
    private String color;

    public Triangle(int width, int height, String color) {
        super(3);
        setWidth(width);
        setHeight(height);
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
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setHeight(int height) {
       this.height = height;
        
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        
    }

    @Override
    public double getArea() {
       return (getHeight() * (double)getWidth()) / 2.0;
    }
    
}
