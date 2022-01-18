package UMLExamples;

public class Square extends Shape {
    private double size = 0;
    //private Point center;

    @Override
    public double computeArea() {
        return size*size;
    }
}
