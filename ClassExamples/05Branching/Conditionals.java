import java.util.Scanner;
public class Conditionals {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fist value: ");
        int num1 = in.nextInt();
        System.out.print("Enter second value: ");
        int num2 = in.nextInt();
        System.out.print("Enter third value: ");
        int num3 = in.nextInt();
        System.out.printf("First number: %d, Second Number: %d, Third Number: %d\n", num1, num2, num3);
        int min12 = min(num1, num2);
        int min123 = min(min12,num3);
        System.out.printf("The minimum value is %d\n", min123);
        System.out.print("Enter first string: ");
        in.nextLine(); //avoid skipping the first line after reading a int
        String str1 = in.nextLine();
        System.out.print("Enter second string: ");
        String str2 = in.nextLine();
        System.out.printf("First string entered: %s, Second string entered: %s\n", str1, str2);
        alpha(str1, str2);
    }
    public static void alpha(String str1, String str2){
        if(str1.compareTo(str2) == 0)
            System.out.println("Equal strings");
        else if(str1.compareTo(str2) < 0)
            System.out.println(str1 + " " + str2);
        else System.out.println(str2 + " " + str1);

    }

    public static int min(int num1, int num2){
        if(num1 < num2)
            return num1;
        else return num2;
    }

}
