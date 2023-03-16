import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileWriteWorksheet {
    private PrintWriter file;

    public FileWriteWorksheet(String fileName) throws IOException {
        //create the object file using FileOutputStream class

    }
    public void close(){
        file.close();
    }
    //sum the even numbers in the list and write that sum
    //into the file
    public void writeSumEvenNumbers(ArrayList<Integer> list){

    }
    //write the number with its number of occurrences in the file
    //for example if number 2 appears 3 times in the list, you will print
    //2:3, one print per line
    public void writeNumbersWithOccurrences(ArrayList<Integer> list){

    }
}
