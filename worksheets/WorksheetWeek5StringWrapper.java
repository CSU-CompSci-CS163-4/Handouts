public class WorksheetWeek5StringWrapper {
    public static void main(String args[]){
        String strNew = activity1("a#b1c d e");
        if(!strNew.equals("")){
            System.out.println(strNew);
        }
        else System.out.println("String does not contains letters!");
        System.out.println(activity2("1a2s3d4"));
        String msg = "abdaabd";
        char c = 'a';
        int count = activity3(msg, c);
        if(count == 0)
            System.out.printf("%c does not happen in %s\n",c, msg );
        else System.out.printf("%c appears %d times in %s\n",c,count, msg);
    }

    public static String activity1(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                ret += c;
            }
        }
        return ret;
    }
    public static long activity2(String str){
        String ret = "";
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c))
                ret+=c;
        }
        if(ret.equals("")) return 0;
        else return Long.parseLong(ret);
    }

    public static int activity3(String str, int c){
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            char cs = str.charAt(i);
            if(cs == c) count++;
        }
        return count;
    }
}

