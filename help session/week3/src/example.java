public class example {
    public static void conditional1(int x) {
        if (x == 1) {
            System.out.println("x is equal to 1!");
        }
        else if (x < 0 ) {
            System.out.println("x is greater than 0!");
        }
        else {
            System.out.println("x is less than 0!");
        }
    }

    public static void equals(String str, String str2) {
        if (str == str2) {
            //dont do this
            System.out.println("str equals");
        }
        if(str.equals(str2)) {

        }
    }
    public static String formatEX(String str, String str2, Double dec) {
        return String.format("%s,%-8s, %.3f", str, str2, dec);
    }


    public static void main(String[] args) {
        System.out.println(formatEX("String1", "String2", 1.1111));
    }
}