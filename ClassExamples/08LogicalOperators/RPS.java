import java.util.Random;
import java.util.Scanner;

public class RPS {
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();

    public String getComputerAction() {
        int action = rnd.nextInt(3); // 0 , 1, 2
        if(action == 0) return "Rock";
        if(action == 1) return "Scissors";
        return "Paper";
    }

    public void playGame() {
        System.out.println("Welcome to The Rock and Paper and Scissors!");
        String keepPlaying = "";
        while(keepPlaying.equals("") || (keepPlaying.length() > 0 && 
                                         parseInput(keepPlaying) == 'y')) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String input = scanner.nextLine();
            String cinput = getComputerAction();
            System.out.printf("You played: %s and the computer played %s%n", input, cinput);
            playGame(parseInput(input), parseInput(cinput));
            System.out.print("Do you want to keep playing (yes or no)? ");
            keepPlaying = scanner.nextLine();
        }

    }

    public static void playGame(char player1, char player2) {
        boolean player1_results = checkResults(player1, player2);
        boolean player2_results = checkResults(player2, player1);

        if(player1_results) {
            System.out.println("You Win!");
        }else if(player2_results) {
            System.out.println("Computer Wins");
        }else {
            System.out.println("No one won, play again!");
        }

    }

    public static char parseInput(String line) {
        if(line.length() > 0)
            return line.toLowerCase().charAt(0);
        return ' ';
    }

    public static boolean checkResults(char option1, char option2) {
        return (option1 == 'r' && option2 == 's') ||
               (option1 == 's' && option2 == 'p') ||
               (option1 == 'p' && option2 == 'r');
    }
    
    public static void main(String[] args) {
        RPS rps = new RPS();
        rps.playGame();

    }
    
}
