import java.util.Random;
import java.util.Scanner;

public class KnowledgeChecks {

    public static void randomLoop() {
        Random rnd = new Random();
        int inc = rnd.nextInt(3,4);
        int max = rnd.nextInt(11);
        System.out.printf("inc=%d, max=%d%n", inc, max);
        for(int i = 0; i < max; i+=inc) {
            System.out.println(i);
        }

    }

    public static void simpleLoop(int total) {
        String tmp = "";
        for (int x = 0; x < total; x++) {
            tmp += (x + ",");
        }
        System.out.println(tmp.length());
    }

    public static void gameMenu() {
        Scanner scanner = new Scanner(System.in);
        char x = ' ';
        while(x != 'y') {
            System.out.print("End program (yes, no)");
            x = scanner.nextLine().charAt(0);
        }
        scanner.close();
    }
    
    public static void loopComparisons(int total) {

        int i = 1;
        String tmp = "";
        while (i <= total) {
            tmp += (i + ",");
            i = i + 1;
        }
        System.out.println(tmp.length());
        for (int x = 0; x < total; x++) {
            System.out.print(x + ",");
        }

    }
    
    public static void main(String[] args) {
        randomLoop();
        simpleLoop(1);
       // gameMenu();
        loopComparisons(7);
    }
    
}
