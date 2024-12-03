public class TestParseur {
    public static void main(String[] args) {
        String[] entrees = {
                "cdc", "bcdc", "cbdcbdcbc", "ccdcbdcdbc", "cdcbbb", "cdcb", ""
        };

        for (String entree : entrees) {
            ParseurDescendant parseur = new ParseurDescendant(entree);
            System.out.println("Entrée : " + entree + " -> " + (parseur.analyser() ? "Acceptée" : "Rejetée"));
        }
    }
}
