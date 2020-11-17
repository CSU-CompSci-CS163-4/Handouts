public class Fruit extends Item{

    // Inheritance: more specific type of Item with different properties like pounds, costPerPound
    private double pounds;
    private double costPerPound;

    public Fruit(double costPerPound, double pounds, String name, int quantity) {
        super(0.0, name, quantity);
        this.pounds = pounds;
        this.costPerPound = costPerPound;
        super.setPrice(costPerPound * pounds);
    }
}
