/**
 * @version 20211022
 */
public class RandomExamples {

    private final String name;
    private final int age;

    public RandomExamples() {
        this("Unknown", -1);
    }
    
    public RandomExamples(String petname, int yearsOld) {
        name = petname;
        age = yearsOld;
    }
    
    public String toString() {
        return String.format("Pet: %s, age: %d", name, age);
    }

    public static void main(String[] args) {
        RandomExamples example = new RandomExamples();
        System.out.println(example);
        
    }
}
