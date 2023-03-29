import java.util.ArrayList;
import java.util.Arrays;
import java.time.Instant;
import java.util.List;

public class SlidesExamples {
    public static void main(String args[]){
        example1();
        example2();
        example3();
        example4();
    }
    public static void example1(){
        String[] rhps = new String[10];
        rhps[0] = "brad";
        rhps[1] = "janet";
        rhps[2] = "magenta";
        rhps[3] = "columbia";
        rhps[4] = "riff-raff";
        rhps[5] = "eddie";
        rhps[6] = "scott";
        rhps[7] = "frankie";
        rhps[5] = "rocky";
        System.out.println(Arrays.toString(rhps));
    }

    public static void example2(){
        String[] tran = new String[10];
        for(int i = 0; i < tran.length; i++) {
            tran[i] = String.format("Tran %d", i);
        }

        for(int i = 0; i < tran.length; i++) {
            System.out.println(tran[i]);
        }
    }
    public static void example3(){
        String[] seats = new String[4];
        seats[0] = "Amy";
        seats[2] = "Rory";
        System.out.println(Arrays.toString(seats));
        for(int i = 0; i < seats.length; i++) {
            System.out.printf("%s is in seat %d%n", seats[i] != null ? seats[i] : "No one", i+1);
        }
    }
    public static void example4(){
        long[] values = new long[1000000];
        Instant start = java.time.Instant.now();
        for(int i = 0; i < values.length; i++) {
            values[i] = i * 10l;
        }
        Instant end = java.time.Instant.now();
        System.out.println("Array Loop Done: " + java.time.Duration.between(start, end).toMillis());
        List<Long> valList = new ArrayList<>(); // remember polymorphism use List
        start = java.time.Instant.now();
        for(int i = 0; i < 1000000; i++) {
            valList.add(i*10l);
        }
        end = java.time.Instant.now();
        System.out.println("List Loop Done: " + java.time.Duration.between(start, end).toMillis());
        // note this is not really the best way to determine the time between algorithms but i
        // us an idea
    }
}
