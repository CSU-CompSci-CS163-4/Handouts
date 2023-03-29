import java.util.Arrays;
import java.util.Scanner;

public class ArrayInts {
    private Scanner in;
    private int [] array;

    public ArrayInts(int length){
        in = new Scanner(System.in);
        array = new int[length];
    }
    public void readArray(){
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter and integer number: ");
            int value = in.nextInt();
            array[i] = value;
        }
    }

    public String toString(){
        return Arrays.toString(array);
    }
}
