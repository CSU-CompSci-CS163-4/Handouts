

/**
 * @version 20211025
 */
public class MoreBranching {

    public static String if_check(String sport) {
        // if else version
        // Fencing then “Wednesday, 4:30PM”
        // Aikido then Monday, 6:00 AM”
        // Boxing then Thursday, 5:00 PM
        // nothing or null, return empty String
        String meeting = "";
        if(sport==null) return meeting;
        if((sport.equalsIgnoreCase("fencing") || sport.equalsIgnoreCase("longsword"))){
            meeting = "Wednesday, 4:30PM";
        }else if(sport.equalsIgnoreCase("aikido")) {
            meeting = "Monday, 6:00 AM";
        }else if(sport.equalsIgnoreCase("boxing")){
            meeting  = "Thursday, 5:00 PM";
        }
        return meeting;
    }

    public static String switch_check(String sport) {
        // ok, need to  keep it lower case
        
        String meeting = "";
        if(sport==null) return meeting;
        String sportLower = sport.toLowerCase();
        switch(sportLower) {
            case "longsword":
            case "fencing":
                meeting = "Wednesday, 4:30PM";
                break;
            case "aikido":
                meeting = "Monday, 6:00 AM";
                break;
            case "boxing":
                meeting  = "Thursday, 5:00 PM";
        }
        return meeting;
    }
    
    public static void main(String[] args) {
        System.out.println(if_check(null));
        System.out.println("TEST: " + if_check("fencing"));
        System.out.println("TEST: " + if_check("FENCing"));
        System.out.println("TEST: " + if_check("aikido"));
        System.out.println("TEST: " + if_check("judo"));
        System.out.println("TEST: " + if_check("longsword"));

        System.out.println("Testing switch");
        System.out.println(switch_check(null));
        System.out.println("TEST: " + switch_check("fencing"));
        System.out.println("TEST: " + switch_check("FENCing"));
        System.out.println("TEST: " + switch_check("aikido"));
        System.out.println("TEST: " + switch_check("judo"));
        System.out.println("TEST: " + switch_check("longsword"));
        
    }
    
}
