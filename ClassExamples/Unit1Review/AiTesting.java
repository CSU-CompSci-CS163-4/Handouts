public class AiTesting {

    private int year;
    private String name;
    private double percent_passed;

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentPassed() {
        return percent_passed;
    }

    public void setPercentPassed(double percent) {
        percent_passed = percent;
    }

    // things to do - format with different sizing and spaces
    // format with percent and decimal points
    public String formatString() {
        return String.format("%s, %d", getName(), getYear()); // for now
    }

    public static void main(String[] args) {
        //System.out.println(age); // not allowed!

        AiTesting turing = new AiTesting();
        turing.setName("Turing");
        turing.setYear(1950);
        System.out.println(turing.formatString());

        AiTesting winograd = new AiTesting();
        winograd.setName("Winograd Schema");
        winograd.setYear(2011);
        System.out.println(winograd.formatString());

        AiTesting marcus = new AiTesting();
        marcus.setName("Marcus Test");
        marcus.setYear(2015);
        System.out.println(marcus.formatString());

        AiTesting ada20 = new AiTesting();
        ada20.setName("Lovelace Test 2.0");
        ada20.setYear(2001);
        System.out.println(ada20.formatString());



    }
    
}
