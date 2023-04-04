public class FullTimeTeacher extends Teacher {
    private double salary;
    public FullTimeTeacher(){
        this("", 0, 0);
    }
    public FullTimeTeacher(String subject, int hours, double salary){
        super(subject, hours);
        setSalary(salary);
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return super.toString() + "Salary: " + salary;
    }
}
