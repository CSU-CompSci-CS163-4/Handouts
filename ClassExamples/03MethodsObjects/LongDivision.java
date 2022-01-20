import java.util.Scanner;

public class LongDivision {
    private int quotient = 0 ;
    private int remainder = 0;
    private int value1 = 0;
    private int value2 = 0;

    public void calculate(int value1, int value2) {
        quotient = value1 / value2;
        remainder = value1 % value2;
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getQuotient() {
        return quotient;
    }

    public int getRemainder() {
        return remainder;
    }
    
    public String getFormattedString() {
        return  value1 + " divided by " + value2 + 
                "\nQuotient: " + quotient + 
                "\nRemainder: " + remainder;
    }

    public static void doLongDivision(int value1, int value2) {
        int quotient = value1 / value2;
        int remainder = value1 % value2;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static LongDivision getClientInput(Scanner scanner) {
        LongDivision div = new LongDivision();
        System.out.print("Enter your first number: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int value2 = scanner.nextInt();
        div.calculate(value1, value2);
        return div;
    }

    public static boolean checkOdd(LongDivision div) {
        return div.getRemainder() % 2 == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // build it once

        LongDivision division3 = getClientInput(scanner);
        System.out.println(division3.getFormattedString());

        LongDivision division4 = getClientInput(scanner);
        System.out.println(division4.getFormattedString());

        System.out.println(checkOdd(division4));

    }
    
}
