public class NamedObject extends MobileObject {
    public final String name;
    private int level = 1;

    public NamedObject(int ID, String name) {
        super(ID);
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public int getMovement() {
        return super.getMovement() * getLevel();
    }


    public static void main(String[] args) {
        GameObject go = new GameObject(10);
        MobileObject mo = new MobileObject(11);
        NamedObject no = new NamedObject(12, "Ganon");
        mo.setMovement(5);
        no.setLevel(2);

        System.out.println(go.MOVABLE);
        System.out.println(no.MOVABLE);
        System.out.println(no.getMovement());
        System.out.println(mo.ID);

    }

}