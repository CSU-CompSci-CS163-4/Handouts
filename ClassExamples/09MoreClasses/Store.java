public class Store {
    public static int nextId = 101;
    private String name;
    private String type;
    private int id;

    public Store(String storeName, String storeType) {
        name = storeName;
        type = storeType;
        id = nextId;

        ++nextId;
    }

    public int getId(){
        return id;
    }
}
