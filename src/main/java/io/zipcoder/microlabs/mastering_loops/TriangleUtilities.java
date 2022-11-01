package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        /*
        String x = "";
        for (int i = 0; i < numberOfStars; i++) {
            x += "*";
        return x;
        }
         */
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfStars; i++){
            sb.append("*");
        }

        return sb.toString();
    }

    public static String getTriangle(int numberOfRows) {
        /*
        String triangle = "";

        for (int i = 1; i <= numberOfRows-1; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle
         */
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        while (idx < numberOfRows) {
            String thisRow = getRow(idx);
            sb.append(thisRow).append("\n");
            idx++;
        }
        return sb.toString();
    }

    public static String getSmallTriangle(int starCount) {

        return getTriangle(5);
    }

    public static String getLargeTriangle(int starCount) {

        return getTriangle(10);
    }
}
