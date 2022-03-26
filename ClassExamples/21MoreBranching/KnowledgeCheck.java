public class KnowledgeCheck {
    public static String getAccessPermissions(Roles role) {
        String permissions = "";
        switch (role) {
            case OWNER:
                permissions += "ch";
            case ADMIN:
                permissions += "x";
            case EDITOR:
                permissions += "w";
            case CLIENT:
                permissions += "r";
                break;
            default:
                permissions = "no-access";
        }
        return permissions;

    }

    public static RoseColor getColor(String meaning) {
        RoseColor rtn;
        switch (meaning.toLowerCase()) {
            case "purity":
                rtn = RoseColor.WHITE;
                break;
            case "jealousy":
            case "friendship":
                rtn = RoseColor.YELLOW;
                break;
            case "sincerity":
                rtn = RoseColor.PEACH;
                break;
            case "elegance":
                rtn = RoseColor.PINK;
                break;
            case "passion":
                rtn = RoseColor.RED;
            default:
                rtn = RoseColor.BLACK;
        }
        return rtn;
    }

    public static String getMeaning(RoseColor color) {
        String rtn;
        switch (color) {
            case WHITE:
                rtn = "purity";
                break;
            case YELLOW:
            case ORANGE:
                rtn = "friendship";
                break;
            case PEACH:
                rtn = "sincerity";
                break;
            case PINK:
                rtn = "elegance";
                break;
            case RED:
                rtn = "love";
            case BLACK:
                rtn = "uniqueness";
            default:
                rtn = "passion";

        }
        return rtn;
    }
}
