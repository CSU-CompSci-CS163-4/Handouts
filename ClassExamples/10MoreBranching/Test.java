public class Test {
    public enum Names {
        DYSON,
        TRICK,
        BO,
        AIFE,
        VEX,
        KENZI
    }
    public static String switchTest(Names name){
        String faeType;
        switch(name) {
            case DYSON:
                faeType = "Werewolf";
                break;
            case TRICK:
                faeType = "Sage";
                break;
            case BO:
            case AIFE:
                faeType = "Succubus";
                break;
            case VEX:
                    faeType = "Mesmer";
                break;
            default:
                faeType = "human";
        }
        return faeType;
    }

    public static void main(String args[]){
        System.out.println(switchTest(Names.VEX));
        System.out.println(switchTest(Names.BO));
        System.out.println(switchTest(Names.KENZI));

    }

}
