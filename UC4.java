public class OOPSArray {
    public static void main(String[] args) {
        // Step 1: Store the banner lines in a String Array
        String[] banner = {
            "  *** " + "  +  " + "  +  " + "  ****** ",
            " ** **" + "  +  " + "  +  " + " ** ",
            "*** **" + "  +  " + "  +  " + "*** ",
            "*** **" + "  +  " + "  +  " + "  ****** ",
            "*** **" + "  +  " + "  +  " + "      ** ",
            " ** **" + "  +  " + "  +  " + "** ** ",
            "  **** " + "  +  " + "  +  " + " ***** "
        };

        // Step 2: Use a for-each loop to print every line in the array
        for (String line : banner) {
            System.out.println(line);
        }
    }
}