package InheritanceExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public static ArrayList<Employee> readFile() {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            Scanner scnner = new Scanner(new File("jobs.txt"));
            while(scnner.hasNextLine()) {
                String[] line = scnner.nextLine().split("\\s+"); // \\s+ one or more spaces
                if(line.length < 1) continue; // empty line check
                if(line.length > 1)
                    list.add(new SoftwareEngineer(Integer.parseInt(line[0]), 
                                line[1]));
                else
                    list.add(new Employee(Integer.parseInt(line[0])));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list; 
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = readFile();
        for (Employee em : list) {
            System.out.println(em);
        }
        /*SoftwareEngineer se = new SoftwareEngineer(123, "QRPLC");
        Employee hr = new Employee(1);*/
        //SoftwareEngineer se2 = new SoftwareEngineer(345, "AI9");
        /*String format = "Employee id: %-4s Job Code: %s%n";*/
        /*System.out.println(se);
        System.out.println(hr);
        System.out.println(se2);*/
       /* ArrayList<Employee> list = new ArrayList<>();
        list.add(hr);
        list.add(se);
        list.add(new SoftwareEngineer(345, "AI9"));
        */
        /*
         * System.out.printf(format, se.getID(), se.getJobCode());
         * System.out.printf(format, hr.getID(), hr.getJobCode());
         * System.out.printf(format, se2.getID(), se2.getJobCode());
         */
        
    }

}
