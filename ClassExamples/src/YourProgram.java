import java.util.Scanner;

public class YourProgram {

    public static int findIndex(String str, Character ch, int start) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.printf("TEST: the index is: %d", findIndex("SATOROTAS", 'A', 0));
        System.out.printf("TEST: the index is: %d", findIndex("SATOROTAS", 'T', 3));
        System.out.printf("TEST: the index is: %d", findIndex("SATOROTAS", 'Z', 4));
    }
}

