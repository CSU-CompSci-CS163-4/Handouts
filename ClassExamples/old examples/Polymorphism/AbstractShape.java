package Polymorphism;

public abstract class AbstractShape {
    private final int sides;

    public AbstractShape(int sides) {
        this.sides = sides;
    }

    abstract public double getArea();

    public int getSides() {
        return sides;
    }

    
}
