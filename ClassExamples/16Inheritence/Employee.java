public class Employee {
    private final int pay_low;
    private final int pay_high;
    private String name;
    private final int employee_id;

    public int getLowPay() {
        return pay_low;
    }

    public int getMaxPay() {
        return pay_high;
    }

    public int getID() {
        return employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Name: %s, ID: %d", name, employee_id);
    }

    public Employee(int id, String name, int pay_low, int pay_high) {
        employee_id = id;
        this.pay_low = pay_low;
        this.pay_high = pay_high;
        this.name = name;
    }
}
