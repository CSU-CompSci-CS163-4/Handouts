import java.util.Scanner;

public class InclassActivity {
    Scanner scanner = new Scanner(System.in); // instance!

    public void run() {
        int times = getNumberOfTimes();
        for(int i = 0; i < times; i++) {
            System.out.println(numberGame());
        }
    }

    public int getNumberOfTimes() {
        System.out.print("How many times would you like to run the game? ");
        return scanner.nextInt();
    }

    public String numberGame() {
        int one = getInput();
        int two = getInput();
        String answer = "";
        if(one > two) {
            answer = String.format("%d is higher than %d", one, two);
        } else if(one == two) {
            answer = String.format("%d is equal to %d", one, two);
        } else {
            answer = String.format("%d is less than %d", one, two);
        }
        return answer;
    }

    public int getInput() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
    
    public static void main(String[] args) {
        simpleLoop(9);
        System.out.println();
        InclassActivity activity = new InclassActivity();
       // activity.run();
    }


    public static void simpleLoop(int total) {
        int i = 1;
        while (i <= total) {
            System.out.print(i + ",");
            i = i + 1;
        }
        System.out.println();
        // insert for loop here
       for(int x = 1; x <= total; x++) {
           System.out.print(x + ",");
       }
    }
    
}
