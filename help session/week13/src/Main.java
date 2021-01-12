public class Main {

    public static void main(String [] args){

        // Abstraction: program only handles objects and the relevant info for those objects, not the details of calculating the price
        Cart c = new Cart();

        Item i = new Item(10.0, "steak", 1);
        Fruit f = new Fruit(.7, 2, "bananas", 5);
        Beverage b = new Beverage(2.29, "milk", 2, "gallons");

        c.addItem(i);
        c.addItem(f);
        c.addItem(b);

        System.out.println(c);
    }
}
