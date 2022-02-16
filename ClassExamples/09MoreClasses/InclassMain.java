import java.util.Scanner;

public class InclassMain {
    // just all declared here to make it easier
    private StudentInClass amy = new StudentInClass("CS164", "apond", "Amy Pond");
    private StudentInClass clara = new StudentInClass("CS164", "cooswald", "Clara Oswin Oswald");
    private StudentInClass rory = new StudentInClass("CS163", "rwilliams", "Rory Williams");
    private StudentInClass alice = new StudentInClass("CS163", "awonder", "Alice Liddell");

    private final Scanner scanner = new Scanner(System.in);


    public void run() {
        String action = "";
        while(!action.equalsIgnoreCase("exit") && !action.equalsIgnoreCase("x")) {
            System.out.print("What would you like to do? ");
            action = scanner.nextLine();
            processAction(action);
        }
    }

    private void processAction(String action) {
        if(action.equalsIgnoreCase("list") || action.equalsIgnoreCase("l")) {
            printStudents();
        }else if (action.equalsIgnoreCase("grade") || action.equalsIgnoreCase("g")) {
            addGrade();
        }

    }

    private void addGrade() {
        System.out.print("Which student would you like to add a grade to (use ename)? ");
        String ename = scanner.nextLine();
        StudentInClass tmp = null;
        if(ename.equalsIgnoreCase(amy.getEname())) {
            tmp = amy;
        } else if(ename.equalsIgnoreCase(rory.getEname())) {
            tmp = rory;
        } else if(ename.equalsIgnoreCase(clara.getEname())) {
            tmp = clara;
        } else if(ename.equalsIgnoreCase(alice.getEname())) {
            tmp = alice;
        }
        
        if(tmp != null) {
            System.out.print("What grade (0-100) would you like to add? ");
            double grade = Double.parseDouble(scanner.nextLine());
            tmp.addGrade(grade); // you should talk through at the table how does this work? - hint draw out memory!
            System.out.println("Grade History: " + tmp.getGradeHistory());
        } else {
            System.out.println("invalid student");
        }
    }

    private void printStudents() {
        printStudent(amy);
        printStudent(clara);
        printStudent(rory);
        printStudent(alice);
    }

    private void printStudent(StudentInClass student) {
        System.out.println(String.format("Class: %s%n" +
                                         "Name: %s%n" +
                                         "Grade: %.2f%%", student.classID, 
                                                          student.getName(), 
                                                          student.getGrade()));
    }

    public static void main(String[] args) {
        InclassMain main = new InclassMain();
        main.run();

    }
    
}
