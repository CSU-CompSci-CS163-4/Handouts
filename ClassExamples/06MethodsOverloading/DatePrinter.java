public class DatePrinter {
    public void datePrint(int day, int month, int year) {
        System.out.print("1");
    }
    public void datePrint(int day, String month, int year) {
        System.out.print("2");
        datePrint(day, Integer.parseInt(month), year);
    }
    public void datePrint(int month, int year) {
        System.out.print("3");
        datePrint(1, month, year);
        datePrint(1, String.valueOf(month), year);
    }
}