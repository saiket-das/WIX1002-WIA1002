package WIX1002.Labs.Lab_1;

public class BarChart {
    public static void main(String[] args) {
        // Example data for the bar chart
        int[] values = { 2500, 1600, 2000, 2700, 3200, 800 };
        String[] labels = { "January 2016", "February 2016", "March 2016", "April 2016", "May 2016", "June 2016" };

        // Draw the bar chart
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%-" + 15 + "s: ", labels[i]); // Left-align the label
            for (int j = 0; j < values[i]; j += 100) {
                System.out.print("-"); // Print '|' for 100 unit of values
            }
            System.out.println(); // Move to the next line after drawing the bar
        }
    }
}
