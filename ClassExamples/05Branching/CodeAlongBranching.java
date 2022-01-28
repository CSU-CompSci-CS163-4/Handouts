public class CodeAlongBranching {

    public static void objIfTest(String actual, String expected) {
        boolean isCorrect = actual.equalsIgnoreCase(expected);
        System.out.printf("Are they equal? %b.%n", isCorrect);
        if(actual.equals(expected)) {
            System.out.printf("They are equal! %s%n", expected);
        } else {
            if (actual.equalsIgnoreCase(expected)) {
                System.out.println("They are equal ignoring case: " + expected);
            } else {
                System.out.printf("%s is not the same as %s.%n", actual, expected);
            }
        }
    }

    public static void ifTest(int val1, int val2) {
        if(val1 > val2) {
            System.out.printf("%d is greater than %d.%n", val1, val2);
        } else if(val1 < val2) {
            System.out.printf("%d is less than %d.%n", val1, val2);
        } else {
            System.out.printf("%d is equal to %d.%n", val1, val2);
        }

    }
    public static boolean conditionsPractice(int val1, int val2) {
        return val1 != val2;
    }

    public static void main(String[] args) {
       System.out.println("CONDITIONS PRACTICE: " + conditionsPractice(10, 5));
       System.out.println("CONDITIONS PRACTICE: " + conditionsPractice(5, 10));
       System.out.println("CONDITIONS PRACTICE: " + conditionsPractice(10, 10));

       ifTest(10, 5);
       ifTest(5, 10);
       ifTest(10, 10);

       String hi = "hello";
       String aloha = "Hello!";
       objIfTest(hi, aloha);
    }
    
}
