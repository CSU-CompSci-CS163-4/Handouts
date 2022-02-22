public class OverloadCheck {

    public static String overloaded(int x) {
        return overloaded(x, "answer");
    }

    public static String overloaded(int x, String str) {
        return "The " + str + " is " + x;
    }

    public static void printer() {
      printer("Start:");
    }

    public static void printer(String value) {
        System.out.print(value);
        printer(value + "v2", value + 3);   
    }

    public static void printer(String v1, String v2) {
        System.out.print(v1 + "," + v2);
        printer(3);
    }

    public static void printer(double val) {
        System.out.print(val / 2);
    }

    public static void main(String[] args) {
        System.out.println(overloaded(42, "question")); 
        System.out.println(overloaded(42)); 

        printer();
        System.out.println();

        printer("Go", "G0");
    }
    
}
