import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Unit3Review
 */
public class Unit3Review {


    public static void basicArray() {
        int[] values = {1, 2, 3, 4, 5}; // short hand
        values[0] = 0;
        for(int i = 0; i < values.length; i++) {
            values[i] = values[i] + i;
        }
        System.out.println(Arrays.toString(values));
        for(int val : values) {
            val += 10;
        }
        System.out.println(Arrays.toString(values));

        String[] values2 = new String[3];
        System.out.println(Arrays.toString(values2));
        values2[1] = "Time Warp";
        System.out.println(Arrays.toString(values2));
    }
    public static String loopExample() {
        String rtn = "";
        int i = 4;
        while(i >= 0) {
            for(int x = 1; x < i; x++) {
                rtn += x + ",";
            }
            rtn += ";";
            i -= 1;
        }
        return rtn;
    }

    public static void printWriter(String[][] values) {
        // print writer takes a Steam to Write to
        File file = new File("ouptut.txt"); // creates a steam to a file
        try {
            PrintWriter writer = new PrintWriter(file);
            for(String[] row : values) {
                writer.println(stringToCSV(row));    
            }
            writer.close(); // else it won't save it!
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String stringToCSV(String[] row) {
        StringBuilder bld = new StringBuilder();
        for(String val : row) {
            bld.append(val).append(",");
        }
        bld.deleteCharAt(bld.length()-1); // remove trailing comma
        return bld.toString();
    }

    public static void main(String[] args) {
        System.out.println(loopExample());
      //  basicArray();
        /*String[][] csv_data = { { "Row1", "Header Value", "Header Value" },    
                {"Row2", "some value", "3" },
                { "Row3", "some value3", "three" } };
        printWriter(csv_data);*/

    }
}

