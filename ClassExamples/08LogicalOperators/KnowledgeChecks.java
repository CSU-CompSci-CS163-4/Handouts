public class KnowledgeChecks {

    public static final String SHELLEY = "Mary Shelley";
    public static final String ALLAN = "Allan Rune Pettersson";
    public static final String DOYLE = "Arthur Conan Doyle";

    public static String nameTheAuthor(String novel, int year) {
        if (year <= 1900 && (novel.contains("Frankenstein") ||
                novel.contains("Last")) ||
                novel.contains("Falkner")) {
            return SHELLEY;
        } else if (novel.contains("Frankenstein")) {
            return ALLAN;
        } else if (novel.contains("Lost") || novel.contains("Scarlet"))
            return DOYLE;
        return null;
    }

    public static void main(String[] args) {
        System.out.println(nameTheAuthor("Frankenstein", 1818)); 
        System.out.println(nameTheAuthor("The Last Man", 1826)); 
        System.out.println(nameTheAuthor("The Lost World", 1912)); 
        System.out.println(nameTheAuthor("Frankenstein's Aunt", 1900));
        System.out.println(nameTheAuthor("A Study in Scarlet", 1886)); 
    }
    
}
