package WIX1002.PastYears.WIX1002_2018.Q5;

public class Watermelon extends Fruit {
    double weight;

    // Constructor
    public Watermelon(String fruitname, String fruitType, double weight) {
        super(fruitname, fruitType);
        this.weight = weight;
    }

    // Calculate total price of Watermelon based on Weight and Type
    public double totalCost() {
        double totalPrice = 0;

        // Calculate total price of Watermelon
        if (super.getFruitType().equalsIgnoreCase("Local")) {
            if (weight < 2)
                totalPrice = weight * 2.25;
            else if (weight >= 2 && weight <= 5)
                totalPrice = weight * 1.95;
            else if (weight > 5)
                totalPrice = weight * 1.65;
        }
        if (super.getFruitType().equalsIgnoreCase("imported")) {
            if (weight < 2)
                totalPrice = weight * 3.75;
            else if (weight >= 2 && weight <= 5)
                totalPrice = weight * 3.45;
            else if (weight > 5)
                totalPrice = weight * 3.15;
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        String fruitToString = super.toString();
        return fruitToString + " - " + weight + "kg" + " = " + String.format("RM%.2f", totalCost());
    }
}
