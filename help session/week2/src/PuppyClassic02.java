import java.util.Scanner;

public class PuppyClassic02 {
    public static void main(String[] args) {
        String name = "Cerberus";
        // name = Cerberus
        int puppyCounter = 10; 

        puppyCounter = puppyCounter + 10/3;
        // 10/3 3.33
        // 3
        // 13
        System.out.println(name); // line 1 
        //print: Cerberus
        System.out.println(puppyCounter); // line 2
        //print: 13
        System.out.print(name + " has how many heads? "); 
        //print: Cerberus has how many heads? 3.0heads
        double heads = 3; 
        System.out.println(heads + "heads"); // line 3
        boolean isCool = true; 
        System.out.println(name +" is "+ isCool); //line 4
        //print: Cerberus is true
        Scanner scanner = new Scanner(System.in); 
        System.out.print("How many heads again? "); 
        String dbl = scanner.next(); // assume 3 is entered 
        System.out.println(dbl); // line 5 
        //print: 3
    }
}
