package InheritanceExamples;

/**
 * SuperClass
 */
public class Employee {
    // a superclass is the "parent class"

    private final int employee_id;

    public Employee(int id) {
        employee_id = id;
    }

    public int getID() {
        return employee_id;
    }

    public String getJobCode() {
        return "Unknown";
    }
    
}