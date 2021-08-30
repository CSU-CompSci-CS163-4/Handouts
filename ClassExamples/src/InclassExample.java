import java.util.Arrays;

/**
 * @version 20210630
 */
public class InclassExample {






    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int C = 10;
        System.out.println("Testing Before " + A);
        System.out.println("Testing Before " + B);
        System.out.println("Testing Before " + C);
        A = B;
        B = C;
        System.out.println("Testing After " + A);
        System.out.println("Testing After " + B);
        System.out.println("Testing After " + C);
    }
  
    
}
