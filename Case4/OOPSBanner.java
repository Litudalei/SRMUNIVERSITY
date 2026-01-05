package Case4;

public class OOPSBanner {
public static void main(String[] args) {
	 uc1();
     uc2();
     uc3();
     uc4();
}
public static void uc1()
{
	System.out.println("oops");
}
// ========================== UC2 ==========================
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

// ========================== UC3 ==========================
private static void uc3() {
    String[][] patterns = {
            getOPattern(),
            getOPattern(),
            getPPattern(),
            getSPattern()
    };

    printBanner(patterns);
}

private static String[] getOPattern() {
    return new String[]{
            "  *****  ",
            " *     * ",
            "*       *",
            "*       *",
            "*       *",
            " *     * ",
            "  *****  "
    };
}

private static String[] getPPattern() {
    return new String[]{
            "*******  ",
            "*      * ",
            "*      * ",
            "*******  ",
            "*        ",
            "*        ",
            "*        "
    };
}

private static String[] getSPattern() {
    return new String[]{
            " ******* ",
            " *       ",
            " *       ",
            " ******* ",
            "       * ",
            "       * ",
            " ******* "
    };
}

private static void printBanner(String[][] patterns) {
    for (int row = 0; row < 7; row++) {
        String line = "";
        for (String[] letter : patterns) {
            line = line + letter[row] + " ";
        }
        System.out.println(line);
    }
}

// ========================== UC4 ==========================
private static void uc4() {

    BannerCharacter[] characters = {
            new BannerCharacter('O', getOPattern()),
            new BannerCharacter('O', getOPattern()),
            new BannerCharacter('P', getPPattern()),
            new BannerCharacter('S', getSPattern())
    };

    printBannerUC4(characters);
}

// Inner Class for Encapsulation
static class BannerCharacter {
    private char character;
    private String[] pattern;

    public BannerCharacter(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

private static void printBannerUC4(BannerCharacter[] characters) {
    for (int row = 0; row < 7; row++) {
        StringBuilder line = new StringBuilder();
        for (BannerCharacter ch : characters) {
            line.append(ch.getPattern()[row]).append(" ");
        }
        System.out.println(line.toString());
    }
}
}

