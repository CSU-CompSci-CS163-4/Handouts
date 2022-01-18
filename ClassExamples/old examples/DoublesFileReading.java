import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 20211006
 */
public class DoublesFileReading {


    public static double[] fileReadingDouble(String filename) {
        double[] values = new double[100];
        int linecount = 0;
        try {
            Scanner scanner = new Scanner(new File(filename));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                double ans = Double.parseDouble(line);
                values[linecount++] = ans;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return copyArray(values, linecount);   
    }
    
    private static double[] copyArray(double[] values, int max) {
        double[] rtn = new double[max];
        System.arraycopy(values, 0, rtn, 0, max);
        return rtn;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fileReadingDouble("doubles.txt")));
    }
    
    
}
