public class objectEx {
    public int A;
    public int B;
    public int getA() {
        return A;
    }
    public int getB() {
        return B;
    }
    public void setA(int a) {
        A = a;
    }
    public void setB(int b) {
        B = b;
    }
    public objectEx(int a, int b) {
        this.A = a;
        this.B = b;
    }
    public static void main(String[] args) {
        objectEx ex = new objectEx(1, 2);
        System.out.println(ex.A);
        System.out.println(ex.B);
        ex.setA(4);
        System.out.println(ex.A);
        
        objectEx ex2 = new objectEx(5, 6);
        System.out.println(ex2.getB());
        System.out.println(ex.getB());
        //notice difference in output

    }
}
