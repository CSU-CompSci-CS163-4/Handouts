/**
 * @version 20210915
 */
public class Exam1Review {
    
   /* public static void question1() {
       // char bill = "bill";
        char rory = 57;
        char amy = 'p';
        char f, z;
    }*/


    public static String branchingCheck(int valOne, int valTwo, 
                                        int valThree) {

        double pi = 3.14;
        String hasPie = "I like pie";
        String morePie = "I need more pie";
        String actualPie = "π";

        if (valOne > valTwo) {
            if (valOne > pi) {
                return hasPie;
            }
        } else if (valTwo >= valThree) {
            return morePie;
        } else {
            if (valThree < 3.14) {
                return actualPie;
            }
            return "The value of pi is: " + pi;
        }
        return "no pie";
    }
    
    public static void corgi() {
        int pug = 10;
        int corgi = 2;
        int counter = 1;
        while(corgi <= pug){ // loop 1
            
            pug -= corgi;
            System.out.printf("TESTING count: %d, pug %d, corgi %d%n", counter++, pug, corgi);
        }
        System.out.println(pug); // question 2

        for(int i = 10; i > 0; i -= 3){ // loop 2
            System.out.println("It must be a hardware problem.");
        }
    }

    public static String formatterC(String str, int d) {
        return String.format("%" + d + "s", str);
    }
    
    public static void main(String[] args) {
        System.out.println(formatterC("Monkey", 10));   // line 1
        System.out.println(formatterC("Monkey", 3));   // line 2
        corgi();
        /*System.out.println(branchingCheck(10,9,8));
        System.out.println(branchingCheck(8,10,20));
        System.out.println(branchingCheck(0, 0, 0));
        System.out.println(branchingCheck(3, 0, 1));
        System.out.println(branchingCheck(0, 1, 2));*/
        
        
    }
    
}
