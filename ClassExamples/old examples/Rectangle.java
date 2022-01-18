public class Rectangle {
    private int length = 0;
    private int width = 0;
    
    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }

    public void setLength(int length) {
        if(length>0) this.length = length;
    }

    public void setWidth(int width) {
        if(width > 0) this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return length*width;
    }
}
