package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evenNums = "";
        for ( int i = start ; i < stop ; i++) {
            if (i % 2 == 0) {
                evenNums += Integer.toString(i);
            }
        }
        return null; //evenNums
    }

    public static String getOddNumbers(int start, int stop) {
        String oddNums = "";
        for ( int i = start ; i < stop ; i++) {
            if (i % 2 == 1) {
                oddNums += Integer.toString(i);
            }
        }
        return null; //oddNums
    }

    public static String getSquareNumbers(int start, int stop, int step) {

        return null;
    }

    public static String getRange(int start) {
        String range = "";
        for (int i = 0; i < start ; i++) {
            range += Integer.toString(i);
        }
        return null; //range
    }

    public static String getRange(int start, int stop) {
        String range = "";
        for (int i = start; i < stop ; i++) {
            range += Integer.toString(i);
        }
        return null;
    }

    public static String getRange(int start, int stop, int step) {

        return null;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {

        return null;
    }
}
