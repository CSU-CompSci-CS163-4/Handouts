import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;
    private double totalCost;

    public Cart(){
        items = new ArrayList<Item>();
        totalCost = 0.0;
    }

    public void addItem(Item i){
        items.add(i);
        totalCost += i.getPrice();
    }

    public double getTotalCost(){
        return totalCost;
    }

    // Polymorphism, overrides Object toString()
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(Item i : items)
            s.append(i + "\n");
        return String.format("Items: \n%s\nTotal Cost: $%.2f", s.toString(), totalCost);
    }
}
