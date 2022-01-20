import java.util.Scanner;

public class LongDivision {
    private int quotient = 0;
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
        int padding = String.valueOf(getQuotient()).length();
        String formatStr = "%d divided by %d\n|   Quotient:  %" + padding + 
                                      "d|\n|   Remainder: %"+padding +"d|";
        return String.format(formatStr, 
                              value1, value2, getQuotient(), getRemainder()); 

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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // build it once
/*
        char val = '\t';
        System.out.println((int)val);
        String myString = "Valentine";
        System.out.println(myString + " a well known historical event.");
        System.out.printf("|%33s|%n", "E");
        System.out.printf("|%33s|%n", myString);

        double percent = 100 / (double)3;
        String percentStr = String.format("|%-32.2f%%|", percent);
        System.out.println(percentStr); */

        LongDivision obj = getClientInput(scanner);
        System.out.println(obj.getFormattedString());
    }

}
