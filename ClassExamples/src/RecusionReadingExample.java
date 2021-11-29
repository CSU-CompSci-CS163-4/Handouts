import java.util.Scanner;

public class RecusionReadingExample {
    public static void recursiveCall(int number, int lowVal, int highVal) {
        int midVal;
        midVal = (highVal + lowVal) / 2;
        System.out.print(number);
        System.out.print(" ");
        System.out.print(midVal);
        if (number == midVal) {
            System.out.println(" f");
        }else {
            if (number < midVal) {
                System.out.println(" l");
                recursiveCall(number, lowVal, midVal);
             }else {
                 System.out.println(" h");
                 recursiveCall(number, midVal + 1, highVal);
                }        
            }
    
    }

    public static String reverse(String str) {
        if(str.isEmpty()) return str;
        return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }

    public static boolean pallidromChecker(String str) {
        if(str.length() < 2) return true;
        return (str.charAt(0) == str.charAt(str.length()-1)) && pallidromChecker(str.substring(1, str.length()-1));
    }

    public static void main(String[] args) {
       /* Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number to find: ");
        int number = scnr.nextInt();
        recursiveCall(number, 0, 10);   */ 

        System.out.println(reverse("gem"));
        System.out.println(reverse("allo"));
        System.out.println(pallidromChecker("ollo"));
        System.out.println(pallidromChecker("rotor"));
        System.out.println(pallidromChecker("rotar"));
        System.out.println(pallidromChecker("battab"));
    }

}
