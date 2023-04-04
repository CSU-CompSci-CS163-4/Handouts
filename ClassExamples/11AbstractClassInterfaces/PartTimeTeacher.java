public class PartTimeTeacher extends Teacher{
    private double hourSalary;
    public PartTimeTeacher(){
        this("",0, 0);
    }
    public PartTimeTeacher(String subject, int hours, double hourSalary){
        super(subject, hours);
        setHourSalary(hourSalary);
    }
    public void setHourSalary(double value){
        hourSalary = value;
    }
    public double getHourSalary() {
        return hourSalary;
    }
    public double getSalary(){
        return hourSalary * getTotalHoursWeek();
    }
    public String toString(){
        return super.toString() + "Hours salary: " + hourSalary;
    }
}
