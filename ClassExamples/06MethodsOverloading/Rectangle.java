public class Rectangle {
    private int height;
    private int width;
    public Rectangle(int width, int height){
        setHeight(height);
        this.setWidth(width);
    }
    public void setHeight(int height){
        this.height = height ;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getArea() {
        return height*width;
    }
}
