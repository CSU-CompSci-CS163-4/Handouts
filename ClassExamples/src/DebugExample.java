import java.util.Arrays;

/**
 * @version 20210630
 */
public class DebugExample {


    public static int[] multiply(int[][] matrix, int[] row) {
        int[] answer = new int[row.length];
        for(int i = 0; i < matrix.length; i++) {
            int total = 0;
            for(int j = 0; j< matrix[i].length; j++) {
                total += matrix[i][j] * row[j];
            }
            answer[i] = total;
        }
        return answer;
    }

/*

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {2,2,2}, {3,3,3}};
        System.out.println(Arrays.toString(multiply(matrix, new int[]{1,2,1})));
    }
  */  
    
}
