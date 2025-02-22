package WIX1002.PastYears.WIX1002_2019.Q5;

public class SpecialDelivery extends Delivery {
    private boolean isWeeknedDelivery;
    private boolean isNightDelivery;

    public SpecialDelivery(String sender, String recipient, double weight, boolean isWeeknedDelivery,
            boolean isNightDelivery) {
        super(sender, recipient, weight);
        this.isWeeknedDelivery = isWeeknedDelivery;
        this.isNightDelivery = isNightDelivery;
    }

    @Override
    public double calculateBaseCost() {
        double totalShippingCost = super.calculateBaseCost();

        // Set new SHIPPING COST for Night and Weekend delivery
        if (isWeeknedDelivery) {
            totalShippingCost += 50;
        }
        if (isNightDelivery) {
            totalShippingCost *= 1.20;
        }

        return totalShippingCost;
    }

    @Override
    public String toString() {
        // Call the base class toString method
        String deliveryDetails = super.toString();

        // Add the night and weekend delivery information
        if (isWeeknedDelivery) {
            deliveryDetails += "Weekend Delivery\n";
        }
        if (isNightDelivery) {
            deliveryDetails += "Night time Delivery\n";
        }

        return deliveryDetails;
    }
}