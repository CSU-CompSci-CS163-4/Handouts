import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class KnowledgeChecks {

    private final PrintWriter writer;

    private void runExample() {
        System.out.println("This is a file writing example"); // line 1
        for (int i = 0; i < 10; i++) {
            writer.print(i); // line 2
        }
        writer.println();
        System.out.printf("Formatted strings are, %s", "cool"); // line 3
        boolean isCool = true;
        writer.printf("Is formatting cool?  %b", isCool); // line 4
        writer.close();
        System.out.close();
    }

    public KnowledgeChecks(String filename) throws IOException {
        writer = new PrintWriter(new File(filename));
    }

    public static void main(String[] args) {
        try {
            KnowledgeChecks writer = new KnowledgeChecks(args[0]);
            writer.runExample();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


   /* public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(new File("output.txt"));
        writer.print("This");
        writer.print("is");
        writer.print("a");
        writer.print("single");
        writer.print("line");
        writer.close();
    }
*/

}