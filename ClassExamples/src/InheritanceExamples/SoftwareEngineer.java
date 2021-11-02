package InheritanceExamples;

public class SoftwareEngineer extends Employee {
    private String jobCode = "None";
    public SoftwareEngineer(int id, String jobCode) {
        super(id);
        this.jobCode = jobCode;
    }
    @Override
    public String getJobCode() {
        return "SE::" + jobCode;
    }


    public static void main(String[] args) {
        SoftwareEngineer se = new SoftwareEngineer(123, "QRPLC");
        Employee hr = new Employee(1);
        SoftwareEngineer se2 = new SoftwareEngineer(345, "AI9");
        /*String format = "Employee id: %-4s Job Code: %s%n";*/
        System.out.println(se);
        System.out.println(hr);
        System.out.println(se2);
        /*
         * System.out.printf(format, se.getID(), se.getJobCode());
         * System.out.printf(format, hr.getID(), hr.getJobCode());
         * System.out.printf(format, se2.getID(), se2.getJobCode());
         */
    }

}
