public class CodeAlongVariables {

    public static void main(String[] args) {
        int value1 = 11;
        int value2 = 2;
        double var_double = 10.5;
        // + , - , * , / , % 
        int newInt = value1 + value2;
        int newInt2 = value1 * value2;
        int newInt3 = value1 / value2; // will truncate the value, 5.5 -> 5
        int newInt4 = value1 - value2;
        int newInt5 = value1 % value2;
        newInt2 = (value1 / value2) * ((newInt2 % value1) + newInt5);

        System.out.println(newInt + " " + newInt2 + " " + newInt3 + " " + newInt4);
        System.out.println(newInt5);

        System.out.println("END OF PROGRAM");

    }
    
}
