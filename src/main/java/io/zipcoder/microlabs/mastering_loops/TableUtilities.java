package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int mult;
        String multistr ="";
        for (int i =1; i <= 10; i++) { //vertical
            for (int j=1; j <= 10; j++) { //horizontal
                mult = i * j;
                multistr += String.format("%3d |",mult);
            }
            multistr += "\n";
        }
        return multistr;
    }

    public static String getLargeMultiplicationTable() {

        return null;
    }

    public static String getMultiplicationTable(int tableSize) {

        return null;
    }
}
