package WIX1002.Labs.Lab_2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Water input (in gram)
        System.out.print("Enter the amount of water in grams: ");
        double m = sc.nextDouble();
        // Convert to kg
        m = m / 1000;

        // Intial temperature (in Fahrenheit)
        System.out.print("Enter the intial temperature in Fahrenheit: ");
        double inital_temp = sc.nextDouble();
        inital_temp = fahrenheit_to_celsius(inital_temp); // Convert to Celcius

        // Final temperature (in Fahrenheit)
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_temp = sc.nextDouble();
        final_temp = fahrenheit_to_celsius(final_temp); // Convert to Celcius

        // Energy in joules
        double energy = m * (final_temp - inital_temp) * 4184;
        // Convert the number to scientific notation
        String scientificNotation = String.format("%.6e", energy).replace("E", "e");
        System.out.println("The energy needed is " + scientificNotation);

        sc.close();
    }

    // Fahrenheit to Celsius convert function
    public static double fahrenheit_to_celsius(double temp_f) {
        return (5 * (temp_f - 32) / 9);
    }
}
