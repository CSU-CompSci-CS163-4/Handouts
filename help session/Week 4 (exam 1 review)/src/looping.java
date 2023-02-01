public class looping {

    public static void doWhileLoop() {
        int i = 0;
        while (i != 0) {
            System.out.println("IN WHILE LOOP");
        }
        do {
            System.out.println("IN DO WHILE LOOP");
            System.out.println(i);
        } while (i != 0);
    }

    public static void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void forLoop() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //forLoop();
        System.out.println();
        //whileLoop();
        System.out.println();
        doWhileLoop();
    }   
}