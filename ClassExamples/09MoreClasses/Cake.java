public class Cake {
    public static final boolean IS_GOOD = true;
    private String name;
    private double cost;

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
    public Cake(){
        this("", 0);
    }
    public Cake(String name, double cost) {
        setName(name);
        setCost(cost);
    }
}
