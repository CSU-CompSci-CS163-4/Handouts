public class StudentInClass {
    public final String classID;
    private String ename;
    private String name;
    private double grade;
    private String gradeHistory = "";

    // add the constructor
    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getGradeHistory() {
        return gradeHistory;
    }

    public void addGrade(double grade) {
        updateGradeHistory(grade);
        updateGrade(grade);
    }

    private void updateGradeHistory(double grade) {
        gradeHistory += grade + ","; 
    }

    private void updateGrade(double grade) {
        double tmp = this.grade;
        this.grade += grade;
        if(tmp != 0) this.grade /= 2;
    }

    
}
