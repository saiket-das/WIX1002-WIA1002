package past_years.WIX1002_2019.Q5;

public class Delivery {
    private String sender;
    private String recipient;
    private double weight;
    private double totalShippingCost;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.totalShippingCost = calculateBaseCost();

    }

    public double getTotalShippingCost() {
        return this.totalShippingCost;
    }

    public void setTotalShippingCost(double specialShippingCost) {
        this.totalShippingCost = specialShippingCost;
    }

    // Calculate total cost
    // Method for calculating shipping cost based on weight
    public double calculateBaseCost() {
        double cost = 0;
        double remainingWeight = weight;

        // Calculate the cost for the first 5 kg
        if (remainingWeight <= 5) {
            cost += remainingWeight * 2.80;
        } else {
            cost += 5 * 2.80;
            remainingWeight -= 5;

            // Calculate the cost for the next 15 kg (5 to 20 kg)
            if (remainingWeight <= 15) {
                cost += remainingWeight * 5.20;
            } else {
                cost += 15 * 5.20;
                remainingWeight -= 15;

                // Calculate the cost for the next 30 kg (20 to 50 kg)
                if (remainingWeight <= 30) {
                    cost += remainingWeight * 7.00;
                } else {
                    cost += 30 * 7.00;
                    remainingWeight -= 30;

                    // Calculate the cost for weight beyond 50 kg
                    cost += remainingWeight * 8.60;
                }
            }
        }
        return cost;
    }

    public String toString() {
        return "From: " + sender + " To: " + recipient + "\n" +
                "Weight of package: " + weight + " kg\n" +
                "Shipping Cost: RM" + String.format("%.2f", calculateBaseCost()) + "\n";
    }
}
