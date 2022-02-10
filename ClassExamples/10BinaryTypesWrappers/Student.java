public class Student {
    private String ename;
    private int id;
    
    public Student(String ename, int id) {
        this.ename = ename;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("{ename:%s, id:%d}", 
                             ename, id);
    }

    public static void main(String[] args) {
        Student amy = new Student("apond", 800111222);
        Student rory = new Student("rwilliams", 811222333);

        System.out.println(amy);
        System.out.println(rory);
        
    }

    
}
