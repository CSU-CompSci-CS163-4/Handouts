import java.util.Arrays;

public class KnowledgeCheck {

    public static int[] x(int[][] matrix, int[] row) {
        int[] answer = new int[row.length];
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j] * row[j];
            }
            answer[i] = total;
        }
        return answer;
    }


    public static int[] y(int[][] matrix, int[] row) {
        int[] answer = new int[row.length];
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j] % row[j];
            }
            answer[i] = total;
        }
        return answer;
    }

    public static void swapper(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void swapper2(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void swapper3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length-1; j > i; j--) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 20, 21, 22 }, { 30, 31, 32 } };
 /*       System.out.println(Arrays.toString(y(matrix, new int[]{2,2,2})));
        System.out.println(Arrays.toString(y(matrix, new int[] { 2, 2, 1 })));
        System.out.println(Arrays.toString(y(matrix, new int[] { 1, 2, 1 })));
*/
        swapper3(matrix);
        for(int[] row : matrix) 
            System.out.println(Arrays.toString(row));
    }
}