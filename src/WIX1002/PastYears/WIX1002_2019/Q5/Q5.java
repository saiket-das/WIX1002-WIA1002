package WIX1002.PastYears.WIX1002_2019.Q5;

public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery[] deliveries = {
                new SpecialDelivery("Ali", "Ahmad", 4.4, false, false),
                new SpecialDelivery("Ahan", "Saiket", 63.1, false, false),
                new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false),
                new SpecialDelivery("Ang", "Liew", 19.0, true, true),
        };

        double totalShippingCost = 0;
        for (SpecialDelivery delivery : deliveries) {
            totalShippingCost += delivery.calculateBaseCost();
            System.out.println(delivery.toString() + "\n");
        }
        System.out.println("The total shipping cost is RM" + String.format("%.2f", totalShippingCost));

    }

}
