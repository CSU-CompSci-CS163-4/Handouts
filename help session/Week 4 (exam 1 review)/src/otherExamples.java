public class otherExamples {
    public static void main(String[] args) {
        // modulo
        System.out.println(5 % 2);
        System.out.println(6 % 2);
        System.out.println(7 % 3);
        System.out.println(5 % 4);
        System.out.println(5 % 3);
        System.out.println();
        // String.format
        System.out.println(String.format("Hello %s", "World"));
        String hello = "World";
        //same thing as above
        System.out.println(String.format("Hello %s", hello));
        System.out.println();
        // String.format with spacing
        System.out.println(String.format("Hello %10s", "World"));
    }
}
