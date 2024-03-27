public class Carnivores extends Animal {
    public Carnivores(){
        super();
    }
    public Carnivores(String name, int years){
        super(name, years);
    }
    public void eat(){
        System.out.println("Carnivores Eat meat");
    }
}
