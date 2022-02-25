public class GameObject {
    public final int ID;
    public final boolean MOVABLE;

    public GameObject(int id) {
        this(id, false);
    }

    protected GameObject(int id, boolean canMove) {
        ID = id;
        MOVABLE = canMove;
    }


}