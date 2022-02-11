public class KnowledgeCheckTrek {

    public static final String TNG = "The Next Generation";
    public static final String DS9 = "Deep Space Nine";
    public static final String VOYAGER = "Voyager";

    public static String trek(String character) {
        if (character != null && (character.equalsIgnoreCase("Picard") ||
                character.equalsIgnoreCase("Data"))) {  // IF ONE
            return TNG;
        } else if (character != null && character.contains("7")) { // IF TWO
            return VOYAGER;
        } else if ((character.contains("Quark") || character.contains("Odo"))) { // IF THREE
            return DS9;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(trek("Captain Picard")); 
        System.out.println(trek("7 of Nine")); 
        System.out.println(trek("Odo")); 
        System.out.println(trek("Quark"));
        System.out.println(trek("Data").equalsIgnoreCase(TNG)); 
        System.out.println(trek(null)); 
    }
    
}
