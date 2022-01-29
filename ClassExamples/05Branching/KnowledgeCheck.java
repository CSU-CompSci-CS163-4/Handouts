public class KnowledgeCheck {


    public static void printIt(int value) {
        if(value <= 10) {
            if (value > 0) {
                System.out.println("Play a paladin");
            }else {
                System.out.println("Play a white mage");
            }
        }else if (value <= 15) {
            System.out.println("Play a black mage");

        } else {
            System.out.println("Play a monk");
        }
    }

    public static boolean signCheck(int val) {
        return -10 > val;
    }
    
    public static void main(String[] args) {
        System.out.printf("%b, %b, %b", signCheck(10), signCheck(0), signCheck(-10));
        System.out.println();
        printIt(5);
        printIt(10);
        printIt(15);
    }

}
