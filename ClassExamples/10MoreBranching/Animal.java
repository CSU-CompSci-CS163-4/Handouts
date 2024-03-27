public class Animal {
    private String name;
    private int yearsOld;
    public Animal(){
        this("unknow", 0);
    }
    public Animal(String name, int yearsOld){
        this.name = name; this.yearsOld = yearsOld;
    } public String getName(){ return name; }
    public int getYearsOld(){ return yearsOld; }
    public void eat(){
        System.out.println("Animals Eat");
    }
    public String toString(){
        return String.format("Name %s, Years Old: %d", name, yearsOld);
    }
}