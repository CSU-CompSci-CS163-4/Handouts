package InheritanceExamples;

public class SoftwareEngineer extends Employee {
   
    private String project = "None";
    
    public SoftwareEngineer(int id, String project) {
        super(id);
        this.project = project;
    }

    @Override
    public String getJobCode() {
        return "SE::" + project;
    }

    
    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer(123, "QRPLC");
        Employee hr = new Employee(1);
        SoftwareEngineer se2 = new SoftwareEngineer(345, "AI9");
        String format = "Employee id: %-4s Job Code: %s%n";
        System.out.printf(format, se.getID(), se.getJobCode());
        System.out.printf(format, hr.getID(), hr.getJobCode());
        System.out.printf(format, se2.getID(), se2.getJobCode());
    }

}
