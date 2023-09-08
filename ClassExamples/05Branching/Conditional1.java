import java.util.Scanner;
public class Conditional1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter fist value: ");
        int num1 = in.nextInt();
        System.out.print("Enter second value: ");
        int num2 = in.nextInt();
        System.out.printf("First number: %d, Second Number: %d", num1, num2);
        int l = lowest(num1, num2);
        System.out.printf("Lowest is %d\n", l);
        System.out.printf("Lowest is %d\n", lowest(num1, num2));
        System.out.print("Enter third value: ");
        int num3 = in.nextInt();
        int l2 = lowest(l, num3);
        System.out.printf("Lowest is %d\n", l2);

    }
    public static int lowest(int n1, int n2){
        int low = 0;
        if(n1 < n2) low = n1;
        else low = n2;
        return low;
    }


}
