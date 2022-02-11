public class Hero {
    public static final String LEAGUE = "HERO"; // Option A

    public String powerLookup(int which) {
        String rtn = LEAGUE + ": Flight"; // Option B
        if (which < 0) {
            rtn = LEAGUE + ": Laser Eyes"; // Option C
        }
        return rtn;
    }

}