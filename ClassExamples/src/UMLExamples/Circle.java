package UMLExamples;

public class Circle extends Shape {
    private double radius =0;
    //private Point center; 
    
    @Override
    public double computeArea() {
        return Math.PI * (radius*radius);
    }
}
