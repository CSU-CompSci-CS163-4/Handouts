/**
 * @version 20210922
 */
public class StringManipulator {

    public static String encrypt(String msg, int shift) {
        for(int i = 0; i < msg.length(); i++) {
            System.out.println(msg.charAt(i));
        }
        
        return "";
    }

    public static String stringCompress(String msg) {
        
        return "";
    }
    
    public static String runLengthEncoding(String msg) {
        
        return ""; // FIX ME
    }

    // this is just for tests and building tests
    public static void main(String[] args) {
        encrypt("this my msssage", 10);
        System.out.println("\tTEST: encrypt(\"A\", 2) returns C - " + encrypt("A", 2).equals("C"));
        System.out.println("\tTEST: runLengthEncoding(\"AAA\") returns 3A - " + runLengthEncoding("AAA").equals("3A"));
        
    }

  
}
