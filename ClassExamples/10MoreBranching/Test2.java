public class Test2 {
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
}
