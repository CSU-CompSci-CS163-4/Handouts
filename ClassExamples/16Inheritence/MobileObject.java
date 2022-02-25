public class MobileObject extends GameObject {
    private int movement = 10;

    public MobileObject(int id) {
        super(id, true);
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }
}