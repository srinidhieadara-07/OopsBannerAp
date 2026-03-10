public class UC6 {
    
}
public class OOPSBannerUC6 {

    // Static method for letter O
    public static String[] getO() {
        return new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[] {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[] {
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };
    }

    public static void main(String[] args) {

        String[] firstO  = getO();   // O
        String[] secondO = getO();   // O reused
        String[] P = getP();
        String[] S = getS();

        // Loop to print OOPS
        for (int i = 0; i < firstO.length; i++) {
            System.out.println(firstO[i] + "  " +
                               secondO[i] + "  " +
                               P[i] + "  " +
                               S[i]);
        }
    }
}