import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWriteApp {
    public static void main(String args[]){
        try{
            FileWriteWorksheet fw = new FileWriteWorksheet("reports.txt");
            ArrayList<Integer> list = readIntegers("numbers.txt");
            fw.writeSumEvenNumbers(list);
            fw.writeNumbersWithOccurrences(list);
            fw.close();
        }catch(IOException e){
            System.out.println(e.getStackTrace());
        }

    }
    public static ArrayList<Integer> readIntegers(String fileName) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner file = new Scanner(new File(fileName));
        while(file.hasNext()){
            list.add(Integer.parseInt(file.next()));
        }
        return list;
    }
}
