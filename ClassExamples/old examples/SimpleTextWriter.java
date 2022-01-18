import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SimpleTextWriter {
    private final File outfile;
    private final Scanner input = new Scanner(System.in);
    
    public SimpleTextWriter(String outfile_name) {
        outfile = new File(outfile_name);
    }
    
    public String run() {
        // gets  input  from the client, stores as string, returns it
        String line = "";
        StringBuilder contents = new StringBuilder();
        System.out.println("Please start typing below this line. type exit  when  done");
        while(!line.equalsIgnoreCase("exit")) {
            line = input.nextLine();
            contents.append(line).append("\n");
        }
        //System.out.println(contents);
        return contents.toString();
    }
    
    public void save(String to_save) {
        // saves string to  outfile  - hmm could have made this easier
        try {
            PrintWriter writer = new PrintWriter(outfile); // wait, it didn't look for the file until this line!
            writer.println(to_save);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
       // ok, construct the object
        SimpleTextWriter program = new SimpleTextWriter("textedit.txt");
        String contents = program.run();
        program.save(contents);
    }
}
    



