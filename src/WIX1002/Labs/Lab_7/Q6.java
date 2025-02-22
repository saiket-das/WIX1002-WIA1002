package WIX1002.Labs.Lab_7;

import java.io.*;
import java.util.*;

// Product class
class Product {
    String productID;
    String productName;
    double productPrice;

    public Product(String productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}

// Product class
class Order {
    String orderID;
    String productID;
    int orderQuantity;

    public Order(String orderID, String productID, int orderQuantity) {
        this.orderID = orderID;
        this.productID = productID;
        this.orderQuantity = orderQuantity;
    }
}

public class Q6 {

    public static void main(String[] args) {

        String productFileName = "src/lab/lab_7/lab_7_resources/product.txt";
        String orderFileName = "src/lab/lab_7/lab_7_resources/order.txt";

        // ..
        Map<String, Product> productList = new HashMap<>();
        List<Order> orderList = new ArrayList<>();

        try (BufferedReader productFile = new BufferedReader(new FileReader(productFileName));
                BufferedReader orderFile = new BufferedReader(new FileReader(orderFileName))) {

            String line;

            // Read Product file
            while ((line = productFile.readLine()) != null) {
                // Spilti line by Comma(",")
                String[] details = line.split(",");
                // ProductID, ProductName, ProductPrice
                String productID = details[0].trim();
                String productName = details[1].trim();
                double productPrice = Float.parseFloat(details[2].trim());

                Product newProduct = new Product(productID, productName, productPrice);
                productList.put(productID, newProduct);
            }

            // Read Order file
            while ((line = orderFile.readLine()) != null) {
                // Spilti line by Comma(",")
                String[] details = line.split(",");
                // OrderID, ProductID, OrderQuantiy
                String orderID = details[0].trim();
                String productID = details[1].trim();
                int orderQuantity = Integer.parseInt(details[2].trim());

                orderList.add(new Order(orderID, productID, orderQuantity));
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + productFileName + orderFileName);
        } catch (IOException error) {
            System.out.println("Error reading file: " + error.getMessage());
        }

        // Print Result
        System.out.printf("%-10s %-25s %-20s %-30s %s %n", "Product ID", "Product name", "Order Quantity",
                "Product price(per unit)", "Total");
        System.out.printf("%s %n",
                "---------------------------------------------------------------------------------------------------------------");
        for (Order order : orderList) {
            Product product = productList.get(order.productID);
            if (product != null) {
                double total = order.orderQuantity * product.productPrice;
                System.out.printf("%-10s %-25s %-20d %-30.2f %.2f %n", product.productID, product.productName,
                        order.orderQuantity, product.productPrice, total);
            }
        }
    }
}
