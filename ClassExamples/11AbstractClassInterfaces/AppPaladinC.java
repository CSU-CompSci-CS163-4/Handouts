import java.util.ArrayList;
import java.util.Collections;

public class AppPaladinC {
    public static void main(String[] args) {
        ArrayList<PaladinC> list = new ArrayList<>();
        list.add(new PaladinC("Cecil"));
        list.add(new PaladinC("Caliban"));
        System.out.println(list);
        Collections.sort(list); // puts Caliban before Cecil    System.out.println(list); // Caliban, Cecil}
        System.out.println(list);
    }
}
