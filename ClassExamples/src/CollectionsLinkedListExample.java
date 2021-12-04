import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class CollectionsLinkedListExample {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        ListIterator<Integer> intIterator = list.listIterator();
        //what is printed?
        while(intIterator.hasNext()){
            System.out.print(intIterator.next());
        }
        System.out.println("");
         //how to add number 5 between numbers 4 and 6?
         list.add(2, 5);
         //how to add number 1 before number 2?
         list.add(0, 1);
         //how to remove number 2?
         list.remove(new Integer(2));
         //how to remove the second element in the list?
         list.remove(1);
         //what is printed?
        intIterator = list.listIterator();
        while(intIterator.hasNext()){
            System.out.print(intIterator.next());
        }
        System.out.println();
        for(Integer val : list) { // yes this is the same as above
            System.out.print(val);
        }
       }
}
