public class MOB implements Attributes{
    protected String name;
    protected final int hp;
    protected int armor;
    protected int hitModifier;
    protected DiceType damageDie;
    private int damage = 0;


    public MOB(String name, int hp, int armor, int hitModifier, DiceType damageDie) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.hitModifier = hitModifier;
        this.damageDie = damageDie;
    }

    public String getName() {
        return name;
    }
    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        return hp;
    }

    @Override
    public DiceType getDamageDie() {
        return damageDie;
    }

    @Override
    public int getHitModifier() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void addDamage(int amount){
        damage += amount;
    }

    public int getDamage() {
        return damage;

    }
    public int getHP() {
        return getMaxHP() - getDamage();
    }
    public void resetDamage(){
        damage = 0;
    }
    
    public String toString() {
        return "MOB: " + getName() + ":" + getHP() + ":max:" + getMaxHP();
    }

    public MOB copy() {
        return new MOB(getName(), getMaxHP(), getArmor(), getHitModifier(), getDamageDie());
    }


    public static void main(String[] args) {
        MOB test1 = new MOB("Cyclopes", 100, 20, 2, DiceType.D6);
        MOB test2 = new MOB("Knoll", 10, 10, 3, DiceType.D4);
        System.out.println(test1);
        test1.addDamage(10);
        test1.addDamage(10);
        
        MOB test3 = test1.copy();
        test3.addDamage(100);

        System.out.println(test1);

        System.out.println(test2);
        System.out.println(test3);
    }
    
}
