public class KnowledgeChecks{
    private int myValue = 0;

    public void setValue(int myValue) {
        this.myValue = myValue;
    }

    public int getValue() {
        return myValue;
    }



    public static double getAnswer(int first, int second) {
        return 4 * first * second;
    }

    public static String welcome(String basic, String greeting) {
        return greeting + ", " + basic;
    }

    public static int doItx2(int val) {
        return 2*val;
    }

    public static void doIt(int val){
        System.out.print(val);

    }

    public static void main(String[] args) {
        int val = 5;
        int val2 = 10;
        System.out.println(getAnswer(val, val2));

        System.out.println(welcome("Who", "Welcome"));

        System.out.print(doItx2(2));
        doIt(1);
        doIt(1);
        System.out.print(doItx2(4));

    }
    
}
