public class ParseurDescendant {
    private String entree;
    private int index;

    public ParseurDescendant(String entree) {
        this.entree = entree;
        this.index = 0;
    }

    public boolean analyser() {
        return S() && index == entree.length();
    }

    private boolean S() {
        if (correspond('b')) {
            if (S()) {
                return correspond('b');
            }
        } else if (correspond('c')) {
            if (A()) {
                return correspond('c');
            }
        }
        return false;
    }

    private boolean A() {
        if (correspond('b')) {
            if (A() && A()) {
                return true;
            }
        } else if (correspond('c')) {
            if (A() && S() && correspond('A') && correspond('b')) {
                return true;
            }
        } else if (correspond('d')) {
            return correspond('c') && correspond('b');
        }
        return false;
    }

    private boolean correspond(char c) {
        if (index < entree.length() && entree.charAt(index) == c) {
            index++;
            return true;
        }
        return false;
    }
}
