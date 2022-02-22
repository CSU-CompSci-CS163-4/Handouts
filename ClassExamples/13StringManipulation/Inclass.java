import java.util.ArrayList;

public class Inclass {

    public static int find(String str, char c) {
        return find(str, c, 0); // overloaded method!
    }

    /*
     * Activity One
     * Complete the following method.
     * 
     * The goal is for it to return the index of the character it finds in the
     * String str.
     * 
     * Start your loop at the `start` parameter.
     * hint: `int i = start`
     * 
     */
    public static int find(String str, char c, int start) {
        // your code here
        // hint just try writing a loop to see each character

        return -1; // discussion item: why do we opt for minus 1 if we don't find it?
    }

    public static void activityOne() {
        String plant = "kinnikinnick";
        System.out.println("TESTING should be 0: " + find(plant, 'k'));  // discussion: why does this work?
        System.out.println("TESTING should be 6: " + find(plant, 'i', 5));
        System.out.println("TESTING should be -1: " + find(plant, 'J'));
    }


    public static void main(String[] args) {
        activityOne();

        // this is for Activity Two - look at Location.jva
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Fort Collins,40°35'6.9288\"N,105°5'3.9084\"W"));
        locations.add(new Location("Denver,39°44'31.3548\"N,104°59'29.5116\"W"));
        locations.add(new Location("Boulder,40°0'53.9424\"n,105°16'13.9656\"w"));

        System.out.println(locations); 
        // extra challenge
        // add a for:each loop here to go through the locations and just print out the city names 

    }
    
}
