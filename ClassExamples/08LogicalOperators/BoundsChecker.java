public class BoundsChecker {

    /**
     * In class Task One
     * 
     * You will then return a String based on the following:
     * * if the value is lower than the lower, return `null`
     * * if the value is equal to the lower, and lower than the upper
     * * return the String "Near upper" if the value is closer to upper than lower
     * * return the String "Near lower" if the value is closer to lower than upper
     * * if the value is equal to upper or higher, then return `null`
     * 
     * Cavaet: You should *NOT* use logical operators yet (we will get to that in
     * the next activity)
     * 
     * 
     * @param upper - the upper bound, exclusive
     * @param lower - the lower bound, inclusive
     * @param value - the value to check
     * @return - string signalling upper, lower or null if out of bounds
     */
    public static String boundsCheckConditionalsOnly(int upper, int lower, int value) {
       // TODO Task One for students

        return null;
    }

    /* just to make test printing easier */
    public static void testBounds(String expected, String actual) {
        System.out.printf("Results should be %s => Result is %s%n", expected, actual);
    }

    /* modify with your own tests! */
    public static void taskOneTests() {
        testBounds("Near upper", boundsCheckConditionalsOnly(10, 3, 8));
        testBounds(null, boundsCheckConditionalsOnly(100, 0, 101));
        testBounds(null, boundsCheckConditionalsOnly(100, 90, 80));
        testBounds("Near lower", boundsCheckConditionalsOnly(100, 0, 49));
    }

    public static void main(String[] args) {
        taskOneTests();
        taskTwoTests();
        //taskThree();
    }
    

    // TASK TWO METHODS below

    // make sure to add your own tests! Discussion, are there "edge cases" to check
    public static void taskTwoTests() {
        testBounds("Near upper", boundsCheck(10, 3, 8));
        testBounds(null, boundsCheck(100, 0, 101));
        testBounds(null, boundsCheck(100, 90, 80));
        testBounds("Near lower", boundsCheck(100, 0, 49));
    }

    /**
     * Rewrite the statements from boundsCheckConditionalsOnly to use logical operators
     * 
     * @param upper upper bound, exclusive
     * @param lower lower bound, inclusive
     * @param value the value to check
     * @return a statement if it is closer to upper or lower bound
     */
    public static String boundsCheck(int upper, int lower, int value) {
        return null;
    }


    // TASK THREE METHODS

    public static void taskThree() {
        reprintBounds(10, 3, 8);
        reprintBounds(100, 0, 101);
        reprintBounds(100, 90, 80);
        reprintBounds(100, 0, 49);
    }

    public static void reprintBounds(int upper, int lower, int value) {
        String check = boundsCheck(upper, lower, value);
        if (check.contains("upper")) {
            System.out.printf("%d is closer to upper bound between %d and %d.%n", value, lower, upper);
        } else if (check.contains("lower")) {
            System.out.printf("%d is closer to lower bound between %d and %d.%n", value, lower, upper);
        } else {
            System.out.println("Out of bounds");
        }
    }
}
