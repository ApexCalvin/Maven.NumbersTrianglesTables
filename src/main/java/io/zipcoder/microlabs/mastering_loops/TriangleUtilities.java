package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfRows; j++) {
                if (j > i) {
                    triangle = triangle + "\n";
                    break;
                } else {
                    triangle = triangle + "*";
                }
            }
        }
        triangle = triangle + "\n";
        System.out.println(triangle);
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
