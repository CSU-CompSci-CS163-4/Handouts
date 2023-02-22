import java.util.ArrayList;

public class AppDatePrinter {
    public static void main(String args[]){
        DatePrinter dp = new DatePrinter();
        dp.datePrint(22,2, 2023);
        System.out.println();
        dp.datePrint(22,"2", 2023);
        System.out.println();
        ArrayList<String> months = new ArrayList<>();
        months.add("January"); months.add("February");
        dp.datePrint(months.indexOf("January"), 2023);
    }
}
