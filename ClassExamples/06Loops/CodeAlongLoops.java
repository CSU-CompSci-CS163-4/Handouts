import java.util.Scanner;

public class CodeAlongLoops {
    
    public static void simpleWhile(int start, int end) {
        System.out.println("My start will be " + start + ".");
        System.out.printf("My end will be %d.%n", end);

        while(start < end) {
            System.out.printf("%d,", start);
            ++start;
        }
        System.out.printf("%d%n", start);

        System.out.println("Start is now: " + start);
    }
    public static void simpleFor(int start, int end) {
        System.out.println("My start will be " + start + ".");
        System.out.printf("My end will be %d.%n", end);
        for(int i = start; i <= end; ++i) {
            System.out.printf("%d,", i);
        }
        System.out.println("\nStart is still: " + start);
        System.out.println();
    }

    public static void simpleProgram() {
        Scanner scanner = new Scanner(System.in);
        String keepGoing = "";
        while(!keepGoing.equals("exit")) {
            System.out.print("Inside Keep Going, what do you want to do? ");
            keepGoing = scanner.nextLine();
            System.out.printf("So you wana, really wana do %s?%n", keepGoing);
        } 

        scanner.close();
    }

    public static void main(String[] args) {
      /*simpleFor(5, 10);  
      simpleFor(0, 5);
      simpleFor(0, 10);
      System.out.println("=======");
      simpleWhile(5, 10);
        */
      simpleProgram();
    }
}
