import java.util.ArrayList;


public class ForeachChecks {

    public static void testOne2() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Y'shtola");
        list.add("Minfilia");
        list.add("Yda");


        System.out.println("For loop");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        } // end for
        System.out.printf("End loop with a size of %d\n", list.size());

        list.remove(1);

        System.out.printf("\n\nList size of %d\n", list.size());
        list.add("Alisaie");
        list.add("Urianger");
        list.add("Thancred");


        for (String name2 : list) {
            System.out.println(name2);
        } // end foreach

    }

    public static void testOne() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alisaie");
        list.add("Urianger");
        list.add("Minfilia");
        list.add("Yda");
        list.add("Thancred");
        list.add("Y'shtola");

        System.out.println("For loop");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        } // end for
        System.out.printf("End loop with a size of %d\n", list.size());

        list.remove(2);

        System.out.printf("\n\nStarting for:each loop with a size of %d\n", list.size());
        for (String name2 : list) {
            System.out.println(name2);
        } // end foreach

    }

    public static void testTwo2() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Urianger");
        list.add("Alisaie");
        System.out.println("Print 1: " + list);
        list.remove(1);
        System.out.println("Print 2: " + list);
        list.add("Thancred");
        list.add("Minfilia");
        list.remove(2);
        System.out.println("Print 3: " + list);
        list.add(list.size() - 2, "Y'shtola");
        list.add("Yda");
        System.out.println("Print 4: " + list);
    }

    public static void testTwo() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Alisaie");
        list.add("Urianger");
        System.out.println("Print 1: " + list);
        list.remove(1);
        System.out.println("Print 2: " + list);
        list.add("Yda");
        list.add("Minfilia");
        list.remove(2);
        System.out.println("Print 3: " + list);

        list.add("Thancred");
        list.add(list.size()-2,"Y'shtola");
        System.out.println("Print 4: " + list);
    }

    public static void main(String[] args) {
        testTwo2();
        
    }
    
}
