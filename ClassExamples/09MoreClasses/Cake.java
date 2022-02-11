public class Cake {
    public static boolean EAT_IT = true; // Label 1
    private String name; // Label 2
    private double cost;

    public Cake() { // Label 3
        this("Chocolate", 0.0);
    }

    public Cake(String name, double cost) { // Label 4
        setName(name);
        setCost(cost);
    }

    // Label 5
    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public static void main(String[] args) {
        Cake coconut = new Cake("Coconut", 1.0);
        Cake chocolate = new Cake();

        double save = chocolate.getCost();
        chocolate.setCost(coconut.getCost());
        coconut.setCost(save);

        coconut.setName(chocolate.getName()+ " " +coconut.getName());
        
        System.out.println(coconut.getCost());
        System.out.println(coconut.getName());
    }
}
