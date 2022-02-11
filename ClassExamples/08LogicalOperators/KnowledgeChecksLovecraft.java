public class KnowledgeChecksLovecraft {

    public static boolean isLovecraftian(String value, int cultists) {
        if (value != null && value.length() < 10) {
            if (value.equalsIgnoreCase("ghast") ||
                    value.equalsIgnoreCase("cthulhu") ||
                    value.equalsIgnoreCase("dagon") ||
                    value.equalsIgnoreCase("mi-go")) {
                return true;
            } else
                return cultists < 100 && cultists > 10;

        } else if (value != null && value.length() > 10) {
            return (value.equalsIgnoreCase("Kassogtha") ||
                    value.equalsIgnoreCase("Shoggoth") ||
                    value.equalsIgnoreCase("Azathoth") ||
                    value.equalsIgnoreCase("Y'golonac") ||
                    value.equalsIgnoreCase("Yog-Sothoth") ||
                    value.equalsIgnoreCase("Nyarlathotep"));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLovecraftian("Dracula", 3)); 
        System.out.println(isLovecraftian("Nyarlathotep", 1000)); 
        System.out.println(isLovecraftian("Unnamed", 20)); 
        System.out.println(isLovecraftian("Beebo", 10)); 
        System.out.println(isLovecraftian(null, 20)); 
    }
    
}
