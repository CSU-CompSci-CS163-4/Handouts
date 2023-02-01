public class knowledgeCheck1 {

    public static String formtterA(String str) {
        return String.format("%6s%c, %S", str, str.charAt(str.length() - 1), str);
    }

    public static String foramtterC(String str, int d) {
        return String.format("%" + d + "s", str);
    }
    public static void main(String[] args) {
        System.out.println(formtterA("Zelda"));
        System.out.println(foramtterC("Monkey", 10));
        System.out.println(foramtterC("Monkey", 3));

    }
}
