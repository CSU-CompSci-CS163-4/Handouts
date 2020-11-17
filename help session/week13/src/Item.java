public class Item {
    // Encapsulation: all variables are private, object is self-contained and data is accessed through methods
    protected double price;
    protected String name;
    protected int quantity;

    public Item(double price, String name, int quantity){
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    // Polymorphism, overrides Object toString()
    public String toString(){
        return String.format("%d %s\t\tPrice: %.2f", quantity, name, price);
    }
}
