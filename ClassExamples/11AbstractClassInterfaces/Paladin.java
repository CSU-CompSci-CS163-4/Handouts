public class Paladin extends AbstractJob {
    private double modifier = 1.6;
    @Override
    public double getJobModifier() {
        return modifier;
    }
    public Paladin(String name) {
        super(name);
    }
}
