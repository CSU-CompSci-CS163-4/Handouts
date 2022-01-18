class StringChractersSlideExamples {

    public static void stringChar() {
        char myChar = 'x'; // notice single quotes
        char newLine = '\n'; // the invisible newline character
        char myChar2 = 57; // bad idea! It sets the value to the character ‘9’
        char what = (char) ('A' + 2); // what is now ‘C’ (used in things like the Caesar cipher)

        char c = 'C';
        char m = 'M';
        String mascot = "CAM";

        char last = mascot.charAt(2);
        int len = mascot.length(); // 3

    }

    public static void stringFormat() {
        int aNumber = 42;
        String question = "The Answer To Life, The Universe And Everything";
        System.out.println(question + aNumber);
        // Prints “The Answer To Life, The Universe And Everything42” .. whoops
        System.out.println(question + "  is " + aNumber);
        // Prints “The Answer To Life, The Universe And Everything is 42”  <- success!

        String towelColor = "pink";
        String dontPanic = "Don't forget to bring your " + towelColor + " towel";
        String txt = "Don't panic";
        String heading1  = "<h1>" + txt + "</h1>";

    }

    public static String percentNoFormat(double val) {
        return val + "%"; 
    }

    public static String percentFormat(double val) {
        return String.format("%.2f%%", val);
    }


    public static void towelFormat2() {
        String towelColor = "pink";
        String dontPanic = String.format("Don't forget to bring your %s towel", towelColor);
        String txt = "Don't panic";
        String heading1 = String.format("<h1>%s</h1>", txt);

        System.out.printf("<h1>%s</h1>", txt);

    }
    public static void main(String[] args) {
     

    }


}