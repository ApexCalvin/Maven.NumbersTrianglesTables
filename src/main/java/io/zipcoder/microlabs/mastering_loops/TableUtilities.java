package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    //String.format()
    public static String getMultiplicationTable(int tableSize) {
        int holder;
        //tableSize = 10;
        String multistr ="";
        for (int i =1; i <= tableSize ; i++) { //vertical
            for (int j=1; j <= tableSize ; j++) { //horizontal
                holder = i * j;
                multistr += String.format("%3d |", holder);
            }
            multistr += "\n";
        }
        return multistr;
    }
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }
}
