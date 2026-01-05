package Case3;


public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare String Arrays to hold patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble and display the banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            String line = String.join(
                "   ",
                oPattern[i],
                oPattern[i],   // Second 'O'
                pPattern[i],
                sPattern[i]
            );
            System.out.println(line);
        }
    }
}

