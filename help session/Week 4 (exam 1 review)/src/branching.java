public class branching {

    public static void forBranch(int i) {
        if (i == 0) {
            System.out.println("i is 0");
        }
        else if (i < 0) {
            System.out.println("i is less than 0");
        }
        else {
            System.out.println("i is greater than 0");
        }
    } 
    
    public static void main(String[] args) {
        forBranch(0);
        forBranch(-1);
        forBranch(1);
    }
    
}
