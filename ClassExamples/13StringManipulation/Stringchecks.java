public class Stringchecks {

    public static String sub(String str) {
        return str.substring(str.indexOf(",") + 1, str.indexOf(",", str.indexOf(",") + 1));
    }

    public static String sub2(String str) {
        return str.substring(str.indexOf("@"));
    }

    public static String sub3(String str) {
        String rtn = "";
        String key = "KitHawk";
        String key2 = "abcdefgh";

        rtn += key2.charAt(key.indexOf(str.charAt(0)));
        rtn += key2.charAt(key.indexOf(str.charAt(1)));
        rtn += key2.charAt(key.indexOf(str.charAt(2)));

        return rtn;
    }

    public static void main(String[] args) {
        System.out.println(sub("Magenta,Brad,,Columbia")); 
        System.out.println(sub2("frankie@@rhps.com")); 
        System.out.println(sub3("kaKwiH"));
    }

    public static void main_old(String[] args) {
    String magic = "abracadabra";
    String shorter = magic.substring(magic.indexOf("b"), 
                                 magic.indexOf("a", magic.indexOf("c"))+1);
    
    String plant = "kinnikinnick";
    String p2 = plant.substring(plant.indexOf("k"),
            plant.indexOf("k", plant.indexOf("i"))+1);
    System.out.println(p2);

    String knocker = "tattarrattat";
    String knock = knocker.substring(knocker.indexOf("r")+1,
                knocker.indexOf("t", knocker.length()-1)+1);
    System.out.println(knock);

    String curse = "Avada Kedavra";
    int index = curse.indexOf('a', curse.indexOf('a')+1);
    System.out.println(index);

      String spell = "Redikulus";  
      spell.lastIndexOf('u');
      spell.indexOf('u', spell.indexOf('l'));
      spell.indexOf('u', spell.length() - 2);
      spell.indexOf('u', 5);
      spell.substring(5, spell.length()).indexOf('u');
//      spell.contains('u');
    }
}
