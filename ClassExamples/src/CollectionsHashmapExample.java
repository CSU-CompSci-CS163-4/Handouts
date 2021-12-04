import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsHashmapExample {
    public static void main(String args []){
        Map<String, Double> mapCountry = new HashMap<String, Double>();
        mapCountry.put("Brazil",3288000.0);
        mapCountry.put("USA", 3797000.0);
        mapCountry.put("Portugal", 35603.0);
        mapCountry.put("India", 1269000.0);
        System.out.println(mapCountry);
        //how to return a list of keys?
        Set<String> keys = mapCountry.keySet();
    // String[] sorted = (String[])keys.toArray();
      //  Arrays.sort(sorted);
        //System.out.println(sorted);
        System.out.println(keys);
        //how to return a list of values?
        //System.out.println(values);
    }
}

