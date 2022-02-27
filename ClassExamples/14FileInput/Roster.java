import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Roster {
    private final ArrayList<Student> students = new ArrayList<>();
    public final String name;

    public Roster(String classname, String filename) {
        this.name = classname;
        readRoster(filename);
    }

    public void printRoster() {
        for(int i = 0; i < students.size(); i++) { // why did I use for, instead of for:each?
            System.out.printf("%d: %s\n", i+1, students.get(i));
        }
    }

    private void readRoster(String filename) {
        try {
           // STUDENT CODE HERE
        }catch(IOException ex) {
            System.err.println("Error reading file: " + filename);
        }
    }

    private Student parseLine(String line) { // notice i built a helper method!
        String name = line.substring(0, line.indexOf(","));
        String email = line.substring(line.indexOf(",")+1);
        return new Student(name, email);
    }

    public static void main(String[] args) {
        Roster roster = new Roster("Mystery 101", "students.csv"); // may need to change file name based on where you saved it
        roster.printRoster();    
    }

}

