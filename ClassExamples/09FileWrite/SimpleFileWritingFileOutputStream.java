import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class SimpleFileWritingFileOutputStream  {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        try {
            printSimpleFile(in);
            readSimpleFile2();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void printSimpleFile(Scanner in) throws IOException{
        PrintWriter file = new PrintWriter(new FileOutputStream("simple.txt"));
        System.out.println("Enter a string - 'exit' to stop");
        String line = in.nextLine();
        while(!line.equals("exit")){
            file.println(line);
            System.out.println("Enter another string - 'exit' to stop");
            line = in.nextLine();
        }
        file.close();
    }
    public static void readSimpleFile(){
        System.out.println("Printing what is in simple.txt file");
        try{
            Scanner file = new Scanner(new File("simple.txt"));
            while(file.hasNext()){
                System.out.println(file.nextLine());
            }

        }catch (IOException e){
            System.out.println("Could not read the file!");
        }
    }

    public static void readSimpleFile2() throws IOException{
        System.out.println("Printing what is in simple.txt file");
        Scanner file = new Scanner(new File("simple.txt"));
        while(file.hasNext()){
            System.out.println(file.nextLine());
        }
    }
}

