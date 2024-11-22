package lab.lab_3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sale volumn input
        System.out.print("Enter the sales volumn: ");
        int salesVolumn = sc.nextInt();

        double commission = 0;

        if (salesVolumn <= 100) {
            commission = salesVolumn * 0.05;
        } else if (salesVolumn > 100 && salesVolumn <= 500) {
            commission = salesVolumn * .075;
        } else if (salesVolumn > 500 && salesVolumn <= 100) {
            commission = salesVolumn * .10;
        } else {
            commission = salesVolumn * .125;
        }

        System.out.println("Total commission: " + String.format("%.2f", commission));
        sc.close();
    }

}
