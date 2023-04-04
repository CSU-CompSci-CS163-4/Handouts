public class PaladinC extends AbstractJob implements Comparable<PaladinC> {
    private double modifier = 1.6;
    @Override
    public double getJobModifier() {
        return modifier;
    }
    @Override
    public int compareTo(PaladinC obj2) {
        return name.compareTo(obj2.name);
    }

    public PaladinC(String name) {
        super(name);
    }
    public String toString(){
        return name;
    }
}
