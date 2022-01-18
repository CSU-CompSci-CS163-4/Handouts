package Polymorphism;

public class Rectangle extends AbstractShape implements HasWidthHeight {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4);
        setHeight(height);
        setWidth(width);
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
        this.height =height;    
    }

    @Override
    public void setWidth(int width) {
       this.width = width;
        
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }
    
}
