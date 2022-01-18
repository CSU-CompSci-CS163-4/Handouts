public class Review3Super {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "address:" + super.toString() +",name:" + getName();
    }
    
}
