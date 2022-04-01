public class KnowledgeChecks {

    public static int something(int val) {
        if(val <= 1) 
            return 1;
        return val * something(val - 1);
    }

    public static boolean stringCheck(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return stringCheck(s.substring(1, s.length() - 1));
        return false;
    }

/*    public static void main(String[] args) {
        System.out.println(stringCheck("satoxrotas"));
    }
*/
public static int do_something2(int val1, int val2) {
    if(val2 <= 0) {
      return 1;
    }
    return val1 * do_something2(val1, val2 - 1);
}

public static void main(String[] args) {
    System.out.println(do_something2(12, 2));
    System.out.println(something(5));
}


}