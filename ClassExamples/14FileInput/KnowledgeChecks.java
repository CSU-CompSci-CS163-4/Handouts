import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class KnowledgeChecks {

    public static void doSomething(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        try {
            Scanner fileHandler = new Scanner(new File("file.txt"));
            while(fileHandler.hasNext()) {
                doSomething(fileHandler.nextLine());
            }
        }catch(IOException io) {
        // what happens if the file is not there??
        }
    }
    
}
