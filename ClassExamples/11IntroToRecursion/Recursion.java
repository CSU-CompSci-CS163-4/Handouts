public class Recursion {
    public static void main(String args []){
        System.out.println(compute(1234, 5));
        System.out.println(compute2(10));
        //System.out.println(compute2(9));
        System.out.println(compute3(100.0, 6));
        convert(13, 2);
        System.out.println(munge("aabbccddeeff"));
        //rec1(1);
        rec2(1);
        int [] list = {1,3,5,7,9};
        System.out.println(rec(list));

    }
    public static int compute(int i, int j){
        if(i < j) return i;
        return compute(i-j, j);
    }
    public static int compute2(int value){
        if(value == 0) return 0;
        int term = value;
        return term + compute2(value-2);
    }

    public static double compute3(double d, int n){
        if(n == 0) return 0.0;
        double term = d;
        return term + compute3(d/10.0, n-1);
    }

    public static void convert(int number, int base){
        int remainder = number%base;
        int quotient = number/base;
        if(quotient > 0) convert(quotient, base);
        System.out.println(remainder);
    }

    public static String munge(String s){
        if(s == null || s.length() <=1)
            return s;
        else if(s.charAt(0) == s.charAt(1))
            return  munge(s.substring(1, s.length()));
        else
            return s.charAt(0) + munge(s.substring(1, s.length()));
    }

    public static void rec1(int i){
        if(i==0)
            System.out.println(i + " ");
        for(int j = 0; j < 2; j++){
            rec1(i-1);
            rec1(i-1);
        }
    }

    public static void rec2(int i){
        if(i==0)
            System.out.println(i + " ");
        else{
            for(int j = 0; j < 2; j++){
                rec2(i-1);
                rec2(i-1);
            }
        }
    }

    public static int rec(int [] list){
        return rec3(list, 0);
    }

    public static int rec3(int [] list, int start){
        if(start == list.length-1)
            return list[start];
        else
            return Math.max(list[start], rec3(list, start+1));
    }
}
