public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEName() {
        return null; // STUDENT change this! Activity 2
    }

    public String toString() {
        return String.format("%s, EName:%s, Email:%s",
                getName(), getEName(), getEmail());
    }

}