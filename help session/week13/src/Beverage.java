public class Beverage extends Item {

    // Inheritance: more specific type of Item with different toString

    private String units;

    public Beverage(double price, String name, int quantity, String units) {
        super(price, name, quantity);
        this.units = units;
    }

    // also polymorphism
    // this toString must be modified because it wouldn't make sense to have a beverage without units, think 1 milk versus 1 gallon milk
    public String toString(){
        return String.format("%d %s %s\tPrice: %.2f", quantity, units, name, price);
    }
}
