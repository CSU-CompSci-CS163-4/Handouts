public class SlideCode {

    public static void longDivision(int value1, int value2) {
        int quotient = value1 / value2;
        int remainder = value1 / value2;
        System.out.println(value1 + " / " + value2 + " = " + quotient);
        System.out.println(value1 + " % " + value2 + " = " + remainder);
    }
    
    public static void main(String[] args) {
        longDivision(12, 30);
        longDivision(100, 5);
        longDivision(1000, 52);
        /*        double quotient, remainder;
        int value1 = 12;
        int value2 = 30;
        quotient = value1 / value2;
        remainder = value1 % value2;
        System.out.println(value1 + " * " + value2 + " = " + quotient);
        System.out.println(value1 + " / " + value2 + " = " + remainder);
        int value3 = 100;
        int value4 = 5;
        quotient = value3 / value4;
        remainder = value1 % value4;
        System.out.println(value3 + " * " + value4 + " = " + quotient);
        System.out.println(value3 + " / " + value4 + " = " + remainder);
        int value5 = 1000;
        double value6 = 0.52;
        quotient = value5 / value6;
        remainder = value5 % value6;
        System.out.println(value1 + " * " + value2 + " = " + quotient);
        System.out.println(value1 + " / " + value2 + " = " + remainder);
        */
    }

}
