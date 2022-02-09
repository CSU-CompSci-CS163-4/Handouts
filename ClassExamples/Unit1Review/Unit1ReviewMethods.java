public class Unit1ReviewMethods {

    /* STATIC METHOD */
    // static, so i can call it directly
    // it is self contained and doesn't need an instance of an object
    // has a return type so needs to return an character
    public static char caesar_shift(char character, int key) {
        int shifted_value = character + key;
        System.out.printf("TESTING:%05d|%n", shifted_value);
        char rtn = (char)(shifted_value);
        System.out.printf("TESTING:%-10C   |%n", rtn);
        return rtn;
    }

    public static void main(String[] args) {
        System.out.println(caesar_shift('a', 2));
        System.out.println(caesar_shift('C', -2));
    }



}