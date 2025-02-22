package WIX1002.Labs.Lab_2;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt(10, 51);
        int num2 = random.nextInt(10, 51);
        int num3 = random.nextInt(10, 51);

        double sum = num1 + num2 + num3;
        double average = sum / 3;
        System.out.println("Number 1: " + num1 + ", Number 2: " + num2 + ", Number 3: " + num3);
        System.out.println("Sum: " + String.format("%.0f", sum) + ", Average: " + String.format("%.2f", average));
    }
}