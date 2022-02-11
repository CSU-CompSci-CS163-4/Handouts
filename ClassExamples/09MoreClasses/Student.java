public class Student {
    private final String ename;
    private final int id;
    private final double gpa;
    private String name = "";
    private String email = "";

    public Student(String ename, int id) {
        this.ename = ename;
        this.id = id;
        gpa = 0;
    }

    public Student(String ename, int id, double gpa) {
        this.ename = ename;
        this.id = id;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        if(email.contains("@")) this.email = email;
        else System.err.println("Error invalid email");
    }

    public String getEmail() {
        return email;
    }

    public String getEName() {
        return ename;
    }

    public int getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        String rtn = String.format("ename: %s, id: %d, gpa: %.1f%n", getEName(), getId(), getGpa());
        rtn += String.format("name:  %s%nemail: %s", getName(), getEmail());
        return rtn;
    }

    public static void main(String[] args) {
        Student bob = new Student("bob", 80000000, 2.0);
        Student amy = new Student("apond", 811222333, 3.5);
        System.out.println(bob.getEName());
        System.out.println(amy);

        

    }
}
