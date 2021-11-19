public class Knight extends MOB{




    protected int xp;
    protected final int id;
    private Fortune activeFortune = null;

    public Knight(int id, String name, int hp, int armor, int hitModifier, DiceType damageDie, int xp) {
        super(name, hp, armor, hitModifier, damageDie);
        this.xp = xp;
        this.id = id;
    }

    public void setActiveFortune(Fortune activeFortune) {
        this.activeFortune  = activeFortune;
    }

    @Override
    public int getArmor() {
        if(activeFortune != null) {
            return activeFortune.getArmor() + super.getArmor();
        }
        return super.getArmor();
    }

    @Override
    public DiceType getDamageDie() {
        if(activeFortune != null) {
            return activeFortune.getDamageDie();
        }
        return super.getDamageDie();
    }

    public static void main(String[] args) {
        Knight test1 = new Knight(10, "Gwain", 100, 20, 2, DiceType.D6, 0);
        Knight test2 = new Knight(1, "Alice", 10, 10, 3, DiceType.D4, 100);

        Fortune fortune = new Fortune("name", 0, 10, 5, DiceType.valueOf("D4"));
        System.out.println(test1.getDamageDie());
        test1.setActiveFortune(fortune);
        System.out.println(test1.getDamageDie());

        System.out.println(test1);
        System.out.println(test2);
    }
    
}
