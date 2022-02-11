import java.util.Scanner;

public class Miniweb {
    private final static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.println("Welcome to Miniweb!");
        Student current = getLoginInfo();
        if(current.getName().equals("")) {
            setNameAndEmail(current);
        }
        System.out.println(current);
    }

    public static void setNameAndEmail(Student student) {
        System.out.print("What would you like to set your name to? ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.print("Email? ");
        String email = scanner.nextLine();
        student.setEmail(email);
    }


    public static Student getLoginInfo() {
        System.out.print("What is your ename: ");
        String ename = scanner.nextLine();
        System.out.print("What is your student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        return new Student(ename, id);
    }

    public static void main(String[] args) {
        run();
    }
    
}
