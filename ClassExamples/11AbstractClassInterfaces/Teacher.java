public abstract class Teacher {
    private static int idGenerator = 1;
    private int id;
    private String subject;
    private int totalHoursWeek;
    public Teacher(){
        this("", 0);
    }
    public Teacher(String subject, int hours){
        setSubject(subject);
        setTotalHoursWeek(hours);
        id = idGenerator;
        idGenerator++;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setTotalHoursWeek(int hours){
        totalHoursWeek = hours;
    }
    public int getTotalHoursWeek(){
        return totalHoursWeek;
    }
    public abstract double getSalary();

    public String toString(){
        return String.format("ID: %d Subject: %s Total Hours of Week: %d", id, subject, totalHoursWeek);
    }
}
