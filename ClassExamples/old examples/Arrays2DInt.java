import java.util.Scanner;


public class Arrays2DInt {
    private final int[][] matrix;

    public Arrays2DInt(int x, int y) {
        matrix = new int[x][y];
    }

    public void setValue(int val, int x, int y) {
        matrix[x][y] = val;
    }


    public int getValue(int x, int y) {
        return matrix[x][y];
    }


    public String toString() {
        String str = "";
        for(int[] row : matrix) {
            for(int col: row) {
                str += col + " ";
            }
            str +="\n";
        }
        return str;
    }


    // note, would be better to break up this method
    public static Arrays2DInt buildArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in size of array (3x3): ");
        int[] coords = splitEntry(scanner.nextLine());
        Arrays2DInt arr = new Arrays2DInt(coords[0],coords[1]);
        for(int i = 0; i < coords[0]; i++) {
            System.out.print("Enter in your row, with spaces between int values: ");
            for(int j = 0; j < coords[1]; j++) {
                if(scanner.hasNext() && scanner.hasNextInt()) {
                    arr.setValue(scanner.nextInt(), i, j);
                }else {
                    scanner.next(); // just skip any non-int values
                }
            }
        }
        scanner.close(); // good case to close it
        return arr;
    }

    // assumes format x
    private static int[] splitEntry(String nextLine) {
        String[] vals = nextLine.split("x");
        if(vals.length == 2) {
            return new int[]{Integer.parseInt(vals[0]), Integer.parseInt(vals[1])};
        } 
        return new int[]{3,3}; // default array size
    }

    public static void main(String[] args) {
        Arrays2DInt arr2D = buildArrayFromConsole();
        System.out.println("Printing Matrix using toString()");
        System.out.println(arr2D); 
    }



}