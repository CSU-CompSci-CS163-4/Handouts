public class Herbivores extends Animal {
    public Herbivores(){
        super();
    }
    public Herbivores(String name, int years){
        super(name, years);
    }
    public void eat(){
        System.out.println("Herbivores Eat Plants");
    }
}
