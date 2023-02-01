public class methods {
        // format of a basic method
        public static void method1(int parm1) {
            System.out.println("Method 1: " + parm1);
        }
    
        // method example with return type
        public static int method2(int a, int b) {
            return a + b;
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
            method1(b);
            System.out.println(method2(a, b));
        }
}
