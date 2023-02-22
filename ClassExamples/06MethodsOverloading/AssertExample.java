public class AssertExample {
    public static int addNum(int x, int y) {
        return x*y;
    }
    public static void main(String[] args) {
        assert (addNum(10, 10) == 20) : "Assert 10,10 == 20 failed!";
        System.out.println(addNum(10,10));
    }


}
