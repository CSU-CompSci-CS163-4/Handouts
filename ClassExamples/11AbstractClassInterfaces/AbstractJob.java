import java.util.ArrayList;

public abstract class AbstractJob {
    protected String name;
    protected ArrayList<String> inventory;
    private int armor;
    private int attack;
    public abstract double getJobModifier();    // unique to sub classes
    public double getArmor() {
        return armor * getJobModifier();
    }
    public AbstractJob(){
        this("");
    }
    public AbstractJob(String name) {
        this.name = name;
        this.armor = 1;
        this.attack = 1;
        inventory = new ArrayList<>();
    }
}
