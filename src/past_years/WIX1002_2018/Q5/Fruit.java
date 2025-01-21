package past_years.WIX1002_2018.Q5;

public abstract class Fruit {
    private String fruitName;
    private String fruitType;

    public Fruit(String fruitName, String fruitType) {
        this.fruitName = fruitName;
        this.fruitType = fruitType;
    }

    // Getter methods
    public String getFruitName() {
        return this.fruitName;
    }

    public String getFruitType() {
        return this.fruitType;
    }

    public abstract double totalCost();

    @Override
    public String toString() {
        return fruitType + " " + fruitName;
    }
}
