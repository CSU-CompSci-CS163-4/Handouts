import java.util.Scanner;

public class SeatFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // read client input
        System.out.println("Welcome to the seat finder!");

        System.out.print("Enter the total seats *per row* in a room? ");
        int rowSize = scanner.nextInt();

        System.out.print("Enter a seat number: ");

        int seatNumber = scanner.nextInt()-1;
        int row = seatNumber / rowSize;
        int seat = seatNumber % rowSize;

        System.out.println();
        System.out.println("The student can be found in row: " + (row+1) + 
                            " and seat: " + (seat+1));
        scanner.close();
    }
    
}
