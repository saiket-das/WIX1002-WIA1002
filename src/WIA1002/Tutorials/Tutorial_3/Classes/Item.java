package WIA1002.Tutorials.Tutorial_3.Classes;

interface ItemProps {
    String getProductName();

    int getProductQuantity();

    double getProductPrice();

}

public class Item implements ItemProps {
    private String productName;
    private int productQuantity;
    private double productPrice;

    public Item(String productName, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public int getProductQuantity() {
        return this.productQuantity;
    }

    @Override
    public double getProductPrice() {
        return this.productPrice;
    }
}
