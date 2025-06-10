package WIA1002.Tutorials.Tutorial_3_ADT.Classes;

import java.util.ArrayList;

public class Items {
    ArrayList<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public void displayItems() {
        System.out.println("-----------------------------------------");
        System.out.printf("%-20s %-10s %-10s\n", "Product Name", "Quantity", "Price");
        System.out.println("-----------------------------------------");

        for (Item item : itemList) {
            System.out.printf("%-20s %-10d $%-9.2f\n",
                    item.getProductName(), item.getProductQuantity(), item.getProductPrice());
        }
    }

}
