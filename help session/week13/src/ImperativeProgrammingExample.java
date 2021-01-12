import java.util.Arrays;

public class ImperativeProgrammingExample {

    public static double calculateTotalPrice(double [] prices){
        double sum = 0;
        for(double d : prices)
            sum += d;
        return sum;
    }

    public static double calculateSalesTax(double price){
        return .008 * price;
    }

    public static void main(String [] args){
        double [] prices = {1.2, 4.5, 8.7, 9.2, 10.5};
        String [] items = {"milk", "coffee", "lasagna", "steak"};
        double subTotal = calculateTotalPrice(prices);
        double salesTax = calculateSalesTax(subTotal);
        double total = subTotal + salesTax;

        System.out.println("You bought: " + Arrays.toString(items));
        System.out.println("The prices of the items were: " + Arrays.toString(prices));
        System.out.printf("Subtotal: %.2f\n", subTotal);
        System.out.printf("Sales Tax: %.2f\n", salesTax);
        System.out.printf("Total: %.2f\n", total);
    }
}