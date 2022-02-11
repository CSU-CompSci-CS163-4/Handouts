public class FinalKnowledgeCheck {

    public static void compileError() {

        System.out.println(Hero.LEAGUE); // Option D
        //Hero.LEAGUE = "Villain"; // Option F

        Hero ajax = new Hero();
        System.out.println(ajax.powerLookup(-1));
    }

    public static void main(String[] args) {
        long test = 10;
        double what = test;

    }

    public class TermPair {

        public final Integer term;
        public final String name;

        public TermPair(int term, String name) {
            this.term = term;
            this.name = name;
        }

    }
    
}
