package WIX1002.PastYears.WIX1002_2018.Q5;

public class Apple extends Fruit {
    int quantity;

    // Constructor
    public Apple(String fruitname, String fruitType, int quantity) {
        super(fruitname, fruitType);
        this.quantity = quantity;
    }

    // Calculate total price of Apple based on Quantity and Type
    public double totalCost() {
        double totalPrice = 0;

        // Calculate total price of Apple
        if (super.getFruitType().equalsIgnoreCase("green")) {
            totalPrice = quantity * 1.20;
        }
        if (super.getFruitType().equalsIgnoreCase("red")) {
            totalPrice = quantity * 1.80;
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        String fruitToString = super.toString();
        return fruitToString + " - " + quantity + " = " + String.format("RM%.2f", totalCost());
    }
}
