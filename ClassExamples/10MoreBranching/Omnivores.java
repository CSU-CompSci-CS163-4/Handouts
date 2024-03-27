public class Omnivores extends Animal {
    public Omnivores(){
        super();
    }
    public Omnivores(String name, int years){
        super(name, years);
    }
    public void eat(){
        System.out.println("Omnivores Eat Plants and meat");
    }
}
