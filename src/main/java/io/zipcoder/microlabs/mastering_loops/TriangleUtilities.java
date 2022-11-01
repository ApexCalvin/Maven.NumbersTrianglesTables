package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";

        for (int i = 1; i <= numberOfRows-1; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        String x = "";
        for (int i = 0; i < numberOfStars; i++) {
            x += "*";
        }
        return x;
    }

    public static String getSmallTriangle() {
        //nested for loop

        return null;
    }


    public static String getLargeTriangle() {
        return null;
    }
}
