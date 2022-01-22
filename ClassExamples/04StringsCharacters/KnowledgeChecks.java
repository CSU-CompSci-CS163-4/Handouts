public class KnowledgeChecks {
    public static String formatterA(double val) {
        return String.format("%.2f%%,%2d", val, (int) val);
    }
    
    public static String formatterB(String str) {
        char tmp = str.charAt(0);
        char tmp2 = str.charAt(str.length()-1);
        return String.format("%S %s%2C%2c", str, str, tmp, tmp2);

    }

    public static char characterAddition(char a, int b) {
        return (char) (a + b);
    }

    public static String stringAddition(String x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(characterAddition('A', 2));
        System.out.println(stringAddition("A", 2));
        
        System.out.println(formatterA(10/3.0));
        System.out.println(formatterB("Link"));

        int nevermore = 'R' + 'a' + 'v' + 'e' + 'n';
        System.out.println(nevermore);
        String clara = "Raven" + ' ' + "nevermore";
        System.out.println(clara);

    }
}
