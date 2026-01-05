package USECASE2;

public class OOPSBanner {

public static void main(String[] args) {
uc1();
        uc2();
}

public static void uc1() {
String str = "OOPS";
System.out.println(str);
}

    public static void uc2() {
        String[] O = {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
        String[] P = {
                "*******  ",
                "*      * ",
                "*      * ",
                "*******  ",
                "*        ",
                "*        ",
                "*        "
        };
        String[] S = {
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        };
        String[][] oops = {O, O, P, S};
        for (int row = 0; row < O.length; row++) {
            StringBuilder line = new StringBuilder();
            for (String[] letter : oops) {
                line.append(letter[row]).append(" ");
            }
            System.out.println(line.toString());
        }
    }
}

