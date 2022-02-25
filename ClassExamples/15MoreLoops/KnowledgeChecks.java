public class KnowledgeChecks {

    public static void checkOne() {
        int i = 9;

        do {
            System.out.println("Line: " + i);
        } while (++i < 10);

        System.out.println("end");
    }

    public static void checkTwo() {
        for (char c = 'A'; c < 'D'; c++) {
            for (int i = 0; i <= 2; i++) {
                System.out.println("seat " + c + i);
            }
        }
    }

    public static void checkThree() {
        int value = 0;
        StringBuilder build = new StringBuilder();
        do {
            build.append(value++);
        } while (++value < 10);
        System.out.println(build.toString()); // print 1

        String hello = "What's----the---motto---with-you?";
        while(hello.contains("--")) {
            hello = hello.replaceFirst("---", "-");
            hello = hello.replaceFirst("--", "-");
            System.out.println("replacing: " + hello);
        }

        System.out.println(hello); // print 2
    }

    public static void main(String[] args) {
        checkOne();
        checkTwo();
        checkThree();
    }


    
}
