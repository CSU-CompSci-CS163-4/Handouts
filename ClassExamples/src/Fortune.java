public class Fortune implements Attributes {
    private final String name;
    private final int hpBonus;
    private final int armor;
    private final int hitModifier;
    private final DiceType type;

    public Fortune(String name, int hpBonus, int armor, int hitModifier) {
        this(name, hpBonus, armor, hitModifier, null);
    }

    public Fortune(String name, int hpBonus, int armor, int hitModifier, DiceType type){
        this.name = name;
        this.hpBonus = hpBonus;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.type = type;
    }
    @Override
    public int getArmor() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMaxHP() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public DiceType getDamageDie() {
        return type;
    }

    @Override
    public int getHitModifier() {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        // add tests here
        
    }
    
}
