import java.util.Scanner;

public class InclassStrings {

    /**
     * Returns an hexidecimal formatted color value, used in HTML and websites. 
     * You can use %X to convert a decimal value to the needed hexademical values that
     * html color coding requests. So 255 will become FF, and 0, will be 0 (notice a single 0)
     * The thing to think about is how can we make sure there is always two items, and padded with a 0
     * as HTML formatting really wants 00.
     * 
     * Remember, you add padding by putting a number before the formatter (X), and then you can pad
     * it with a certain character by putting that charcter before the number so
     * 
     * %$4s -- with the word, "hi", would produce $$hi
     *  
     * @param red a value ranging from 0-255
     * @param green a value ranging from 0-255
     * @param blue a value ranging from 0-255
     * @return hexdecimal formatted color used in html / css, staring with a pound/hash sign
     */
    public static String getHTMLColorCode(int red, int green, int blue) {
        return String.format("#%02X%02X%02X", red, green, blue);
    }

    /**
     * returns RBG(red,green,blue). Try using String.format
     * @param red   a value ranging from 0-255
     * @param green a value ranging from 0-255
     * @param blue  a value ranging from 0-255
     * @return an RGB value in the format of RBG(red,green,blue) without  modification of the numbers
     */
    public static String getRGBFormat(int red, int green, int blue) {
        return String.format("RGB(%d,%d,%d)", red, green, blue);
    }

    /**
     * Builds a string with the htmlcode generated from getHTMLColorCode 
     * and the rgb format from getRBGFormat. It will start with a 
     * bar | single space, HTML code followed by four spaces (consider %-4s) followed by 
     * a single bar and a 16 left space padded rbg vale followed by a single bar 
     * @param red   a value ranging from 0-255
     * @param green a value ranging from 0-255
     * @param blue  a value ranging from 0-255
     * @return returns a line with | htmlCode | rbgFormat|
     */
    public static String getPalletLine(int red, int green, int blue) {
        return String.format("| %-4s    | %16s|",
                            getHTMLColorCode(red, green, blue),
                            getRGBFormat(red, green, blue));

    }
   
    // provided for you
    // however you see some line cut and pasted - can you make another method to simplify this method?
    // how so?
    public static void printColorTable() {
        String row1 = getPalletLine(55, 255, 105); // also feel free to change these values to see
        String row2 = getPalletLine(255, 255, 255);
        String row3 = getPalletLine(0, 0, 0);

        System.out.println("+------------------------------+");
        System.out.println("| HTML Code  |    RGB Value    |");
        System.out.println("|------------------------------|");
        System.out.println(row1);
        System.out.println("|------------------------------|");
        System.out.println(row2);
        System.out.println("|------------------------------|");
        System.out.println(row3);
        System.out.println("+------------------------------+");


    }

    // provided for you. Just another way to use the methods you built
    public static void runMiniProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in red green blue, with spaces in between. 0-255 values: ");
        int red = scanner.nextInt();
        int green = scanner.nextInt();
        int blue = scanner.nextInt();

        System.out.println("The RGB value is " + getRGBFormat(red, green, blue));
        System.out.println("The HTML coded value is  " + getHTMLColorCode(red, green, blue));


    }

    public static void main(String[] args) {

        // add some tests here
        System.out.println(getRGBFormat(17, 127, 255));
        System.out.println(getHTMLColorCode(127, 127, 127));
        System.out.println(getHTMLColorCode(127, 150, 12));
        //
        printColorTable();
       // runMiniProgram();
    }
    
}
