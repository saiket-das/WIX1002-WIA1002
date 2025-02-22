package WIX1002.PastYears.WIX1002_2020;

import java.util.*;
import java.lang.Math;

public class Q2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Location 1");
        double[] location1 = input();
        System.out.println("Enter Location 2");
        double[] location2 = input();

        System.out.printf("Location 1: %.6f Latitude, %.6f Longitude\n", location1[0], location1[1]);
        System.out.printf("Location 2: %.6f Latitude, %.6f Longitude\n",
                location2[0], location2[1]);

        double distance = distance(location1, location2);
        System.out.printf("Distance: %.2f:\n", distance);

    }

    public static double[] input() {
        boolean latitude = false, longitude = false;
        double[] location = new double[2]; // [0] = latitude and [1] = longitude

        while (!(latitude && longitude)) {
            System.out.print("Enter Direction: [N, S, E, E]: ");
            String direction = sc.next();

            System.out.print("Enter Degree, Minute and Second: ");
            double degree = sc.nextDouble();
            double mintue = sc.nextDouble();
            double second = sc.nextDouble();

            // Calculate Latitude or Longitude based on Direction
            if (direction.equals("N") || direction.equals("S")) {
                latitude = true;
                location[0] = decimalDegree(direction, degree, mintue, second);

            } else if (direction.equals("E") || direction.equals("W")) {
                longitude = true;
                location[1] = decimalDegree(direction, degree, mintue, second);
            }
        }

        return location;
    }

    // Calculate Degree in decimal
    public static double decimalDegree(String direction, double degree, double mintue, double second) {

        if (direction.equals("N") || direction.equals("E")) {
            return (degree) + (mintue * 60 + second) / 3600.00;
        } else {
            return -1 * (degree + (mintue * 60 + second) / 3600.00);
        }
    }

    // Calculate distance
    public static double distance(double[] location1, double[] location2) {
        double deltaLatitude = Math.toRadians(Math.abs(location1[0] - location2[0]));
        double deltaLongitude = Math.toRadians(Math.abs(location1[1] - location2[1]));

        double a = Math.pow(Math.sin(deltaLatitude / 2), 2)
                + Math.cos(Math.toRadians(location1[0])) * Math.cos(Math.toRadians(location2[0]))
                        * Math.pow(Math.sin(deltaLongitude / 2), 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = 6371 * c;
        return d;
    }
}
