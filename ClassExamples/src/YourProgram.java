import java.util.Scanner;

public class YourProgram {
    Scanner  scanner = new Scanner(System.in); // instance!

   // Write a program that reads 5 pairs (value1, value2) of int values. 
    // For each pair print the smaller value. If the values are equal, print "equals" and the number.
    //What do we need to change in our code if instead of 5 we want 100 pairs?
   // What do we need to change in our code if instead of a predefined number we would like to ask for the 
    // total number of pairs to read?

    public void loopChallenge(){
        int count = getInput("How many times do you want to loop? ");
        for(int i = 0; i < count; i++) {
            int val1 = getInput();
            int val2 = getInput();
            if(val1 < val2) {
                System.out.println(val1);
            }
            if(val1 == val2) {
                System.out.printf("Equals: %d", val1);
            }
        }
      
    }
    
    // essentially a quick way to ask the same  question
    public int getInput() {
        return  getInput("I need a number? "); 
    }
    //  so  I  don't have to repeat typing these  lines, a method makes sense
    public int getInput(String question)  {
        System.out.print(question);
        return scanner.nextInt();
    }

    
    public static void main(String[] args) {
      YourProgram example =  new YourProgram();
      example.loopChallenge(); // because I  need scanner!
    }
  
    
}

/*
  for(int i = 0; i < 5; i++) {
        int val1 = getInput();
        int val2 = getInput();
        if(val1 < val2) {
        System.out.println(val1);
        }
        if(val1 == val2) {
        System.out.printf("Equals: %d", val1);
        }
        }*/
