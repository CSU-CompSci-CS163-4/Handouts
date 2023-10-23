import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TernaryExample {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("number.txt"));
            while(sc.hasNext()){
                int num = Integer.parseInt(sc.next());
                int numAdd = num % 2 == 0? num: num + 1;
                list.add(numAdd);
            }
        }catch(IOException e){
           e.printStackTrace();
        }
        for(Integer elem: list){
            System.out.println(elem);
        }
    }
}
