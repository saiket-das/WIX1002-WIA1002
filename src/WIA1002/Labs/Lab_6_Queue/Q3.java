package WIA1002.Labs.Lab_6_Queue;

import java.util.Scanner;

import WIA1002.Labs.Lab_6_Queue.Classes.MyQueue;

public class Q3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        MyQueue<Integer> shares = new MyQueue<Integer>();
        MyQueue<Double> prices = new MyQueue<Double>();
        double totalCapitalGain = 0;

        while (!shares.isEmpty()) {
            totalCapitalGain += buyOrSell(shares, prices, totalCapitalGain);
        }

    }

    static double buyOrSell(MyQueue<Integer> shares, MyQueue<Double> prices, double totalCapitalGain) {
        System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
        String query = input.nextLine();

        StockTransaction transaction = parseQuery(query);
        double captialGain = 0;
        if (transaction != null) {
            if (transaction.getOperation().equalsIgnoreCase("Buy")) {
                System.out.println("Buying now....");
                shares.enqueue(transaction.getShare());
                prices.enqueue(transaction.getPrice());
            }

            if (transaction.getOperation().equalsIgnoreCase("Sell")) {
                // Calculate Capital Gain
                captialGain += calculateCapitalGain(shares, prices, transaction.getShare(),
                        transaction.getPrice());

                System.out.println("Selling the shares now....");
                System.out.println("Total Capital Gain / Loss: " + (totalCapitalGain + captialGain));
            }
            System.out.println("Queue for Share: Queue: " + shares);
            System.out.println("Queue for Price: Queue: " + prices);
        }
        return captialGain;
    }

    static double calculateCapitalGain(MyQueue<Integer> sharesQueue, MyQueue<Double> pricesQueue, int sharesToSell,
            double sellingPrice) {

        double capitalGain = 0;

        while (sharesToSell > 0 && !sharesQueue.isEmpty()) {
            int availableShares = sharesQueue.peek();
            double purchasePrice = pricesQueue.peek();

            if (availableShares <= sharesToSell) {
                capitalGain += availableShares * (sellingPrice - purchasePrice);
                sharesToSell -= availableShares;
                sharesQueue.dequeue();
                pricesQueue.dequeue();
            } else {
                capitalGain += sharesToSell * (sellingPrice - purchasePrice);
                sharesQueue.dequeue();
                sharesQueue.enqueue(availableShares - sharesToSell);
                sharesToSell = 0;
            }
        }
        return capitalGain;
    }

    static StockTransaction parseQuery(String query) {
        // Split and extract info
        String[] parts = query.split(" ");
        String operation = parts[0]; // Buy or Sell
        int shares = Integer.parseInt(parts[1]); // number of shares
        int price = Integer.parseInt(parts[4].replace("$", ""));

        return new StockTransaction(operation, shares, price);
    }

}

class StockTransaction {
    private String operation;
    private int share;
    private double price;

    StockTransaction(String operation, int share, double price) {
        this.operation = operation;
        this.share = share;
        this.price = price;
    }

    public String getOperation() {
        return operation;
    }

    public int getShare() {
        return share;
    }

    public double getPrice() {
        return price;
    }

}
