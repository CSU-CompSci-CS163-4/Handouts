import java.util.Scanner;

public class Conditional2 {

        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            String str1 = in.nextLine();
            System.out.print("Enter second string: ");
            String str2 = in.nextLine();
            System.out.printf("First string entered: %s, Second string entered: %s\n", str1, str2);
            alpha(str1,str2);

        }

        public static void alpha(String s1, String s2){
            if(s1.compareTo(s2) == 0){
                System.out.println("Equal strings");
            }
            else if(s1.compareTo(s2) < 0){
                System.out.printf("%s %s \n", s1, s2);
            }
            else {
                System.out.printf("%s %s \n", s2, s1);
            }

        }


}
