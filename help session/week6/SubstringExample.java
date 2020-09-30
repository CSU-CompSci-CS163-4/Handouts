/**
 * @version 20200930
 */
public class SubstringExample {
    
    
    
    public static void main(String[] args) {
        System.out.println(SubstringExample.sub("Matt Smith", 0, 4));
        System.out.println(SubstringExample.sub("helloworld",5));
    }

    private static String sub(String str, int start, int end) {
        StringBuilder rtn = new StringBuilder(str.length());
        for(int i = start; i < end; i++) rtn.append(str.charAt(i));
        return rtn.toString();
    }

    private static String sub(String str, int start) {
        return sub(str, start, str.length());
    }

}
