public class Rectangle {
    private int width;
    private int length;


    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int getArea() {
        return length * width;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args) {
        int width = 10;
        // width = 10
        Rectangle frame = new Rectangle(width, 12);
        // frame
        // width = 10
        // length = 12
        System.out.println(frame.getWidth()); // line 1
        //print 10
        width = 0;
        // width = 12
        System.out.println(frame.getWidth()); // line 2
        //print: 10
        Rectangle silverFrame = new Rectangle(width, 5);
        // silverFrame
        // width = 12
        // length = 5
        System.out.println(silverFrame.getLength()); // line 3
        // print: 5 
        frame.setLength(10);
        // frame
        // width = 10
        // length = 19       
        System.out.println(silverFrame.getLength()); // line 4
        // print: 5
        silverFrame.setLength(10);
        // silverFrame
        // width = 12
        // length = 10
        System.out.println(silverFrame.getArea()); // line 5
        // 120
    }
}
