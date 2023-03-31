public class Shape {
    protected int sides;
    private String color;

    public Shape(int sides, String color){
        this.sides = sides;
        this.color = color;
    }
    public int getSides(){
        return sides;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "Sides: " + sides + " Color: " + color;
    }
}
