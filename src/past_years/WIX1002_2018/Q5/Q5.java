package past_years.WIX1002_2018.Q5;

public class Q5 {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple("Apple", "Red", 8),
                new Apple("Apple", "Green", 11),
                new Watermelon("Watermelon", "Local", 7.6),
                new Watermelon("Watermelon", "Imported", 4),
        };

        // Output and find cheapest fruit
        double cheapestPrice = fruits[0].totalCost();
        String cheapestFruitString = fruits[0].toString();

        for (Fruit fruit : fruits) {
            if (fruit.totalCost() < cheapestPrice) {
                cheapestPrice = fruit.totalCost();
                cheapestFruitString = fruit.toString();
            }
            System.out.println(fruit.toString());
        }

        System.out.println("The cheapest item is: \n" + cheapestFruitString);
    }
}
