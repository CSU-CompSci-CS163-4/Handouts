import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
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

    public static void inPlace(int[] array, int pos1, int pos2) {
        if (pos2 <= pos1) return; // don't run anymore
        int tmp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = tmp; 
        inPlace(array, ++pos1, --pos2);
    }

    public static void inPlace(int[] array) {
        inPlace(array, 0, array.length-1);
    }

    public static void main(String[] args) {
        System.out.println(loopExample());
        int[] arr = {10, 2, 3, 1, 5, 9};
        inPlace(arr);
        System.out.println(Arrays.toString(arr));
      //  basicArray();
        /*String[][] csv_data = { { "Row1", "Header Value", "Header Value" },    
                {"Row2", "some value", "3" },
                { "Row3", "some value3", "three" } };
        printWriter(csv_data);*/

        String[] widgets = {"Phones", "Boxes", "Toys"};
        Review3 one = new Review3("hema", widgets);
        System.out.println(Review3.counter);
        Review3 two = new Review3("akau", widgets);
        System.out.println(Review3.counter);
        System.out.println(one.getName());

        System.out.println(one);
        System.out.println(two);

        ArrayList<Review3Super> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(0, one);
        System.out.println(list);
        list.add(one.copy());
        System.out.println(list);


    }
}

