public class Rectangle {
    int width = 0;  // instance variables
    int length = 0;

    public void setLength(int length) { 
        this.length = length; 
    }

    public void setWidth(int width) { 
        this.width = width; 
    }

    public int getArea() { 
        return width * length; 
    }

    public static void main(String[] args) {
        int length = 10;
        int width = 100;
        Rectangle smallBuildingOnCampus = new Rectangle();
        smallBuildingOnCampus.setLength(length);
        smallBuildingOnCampus.setWidth(width);
        System.out.println(smallBuildingOnCampus.getArea());

        int small = 5;
        Rectangle one = new Rectangle();
        one.setLength(10);
        one.setWidth(10);

        Rectangle two = new Rectangle();
        two.setWidth(small);
        
    }
}
