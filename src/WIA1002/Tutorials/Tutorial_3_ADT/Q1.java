package WIA1002.Tutorials.Tutorial_3_ADT;

import WIA1002.Tutorials.Tutorial_3_ADT.Classes.Candy;
import WIA1002.Tutorials.Tutorial_3_ADT.Classes.Chip;
import WIA1002.Tutorials.Tutorial_3_ADT.Classes.Items;

public class Q1 {
    public static void main(String[] args) {
        Items items = new Items();

        items.addItem(new Candy("Chocolate", 100, 3));
        items.addItem(new Chip("Lay's", 75, 1.5));
        items.addItem(new Chip("Doritos", 80, 1.2));
        items.addItem(new Chip("Pringles", 99, 1.2));

        items.displayItems();

    }
}
