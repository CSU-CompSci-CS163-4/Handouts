import java.util.Random;
import java.util.Scanner;

public class Inclass {

    private static Random rnd = new Random();
    private static Scanner in = new Scanner(System.in);

    public static void runGame() {
        int correct = rnd.nextInt(12) + 1; // nextInt returns 0-11, +1 makes it 1-12
        int guess = 0;
        System.out.println("TESTING/SPOILER - the number is " + correct);
        // STUDENT TODO here


        System.out.println("Congrats you escaped!");
    }



    /*
    Implementation tips:
    1. discuss as a group how would you do this
      * Can you talk about it in english and then work towards pseudocode. 
    2. First code what you know. 
      * Write a loop that just prints the characters followed by a colon.
      * Add an inner loop that also loops through the string. Print out what is going on!
     */
    public static void countCharacters(String line) {
        // student TODO
    }

    public static void main(String[] args) {
        // activity 1
        runGame(); // you may want to comment this out when working on Activity 2

        // activity 2
        countCharacters("blueberry");
        System.out.println();
        countCharacters("kinnikinnick");
    }
    
}
