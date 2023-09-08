import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        calc(in);
        hundredsEvenV1();
        hundredsEvenV2();
    }
    public static void calc(Scanner in){
        int num = 0, count = 0, sum = 0;
        double average = 0;
        System.out.println("Enter a positve number/zero or neg to stop: ");
        num = in.nextInt();
        while(num > 0){
            sum = sum +num; //sum += num;
            count++;
            System.out.println("Enter the next positve number/zero or neg to stop: ");
            num = in.nextInt();
        }
        if(count > 0){
            average = (double)sum/count;
            System.out.println(sum);
            System.out.println(average);
        }
        else System.out.println("No positive numbers");

    }
    public static void hundredsEvenV1(){
        for(int i = 0; i < 200; i+=2){
            System.out.println(i);
        }

    }

    public static void hundredsEvenV2(){
        for(int i = 0; i < 100; i++){
            System.out.println(i*2);
        }

    }
}
