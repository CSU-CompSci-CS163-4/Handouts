// class declaration always the same name as the file
public class examples {

    // format of a basic method
    public static void method1(int parm1) {
        System.out.println("Method 1: " + parm1);

    }

    // method example with return type
    public static int method2(int asd, int b) {
        return asd + b;
    }

    // method example without being static
    public void method3() {
        System.out.println("Method 3");
    }

    // main method is the entry point of the program
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum;
        //System.out.println("Method 1: " + b);
        method1(b);
        //a = method2(b, c);
        //System.out.println("Method 1: " + a);
        method1(a);
        System.out.println(method2(a, b));
        sum = method2(a,b);
        System.out.println(sum);
        examples ex = new examples();
        ex.method3();
    }
}
