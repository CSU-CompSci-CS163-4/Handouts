import java.io.File;
import java.util.Scanner;

public class Unit2Review_FileReading {

    public static void main(String[] args) {
        scannerTest();
    }

    public static void scannerTest()  {
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            String[] line = scanner.nextLine().split(",");
            System.out.println(line[ 1 ]);
            System.out.println(scanner.next());
            scanner.nextLine();
            System.out.println(scanner.nextLine().split(",")[ 0 ]);
        }catch(Exception ex) {
            System.out.println("Exception!");
        }
    }

}
