package WIX1002.Tutorials.Tutorial_8;

class Payment {
    private double amount = 0;
    private String checkNumber;
    private String cardNumber;
    private int cvv;

    public void newPayment(double amount) {
        this.amount = amount;
        System.out.println("Current amount: " + this.amount + " and Pay by: Card" + "\n");
    }

    public void newPayment(double amount, String checkNumber) {
        this.amount = amount;
        this.checkNumber = checkNumber;
        System.out.println("Current amount: " + this.amount);
        System.out.println("Pay by Check. Check number = " + this.checkNumber + "\n");

    }

    public void newPayment(double amount, String cardNumber, int cvv) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        System.out.println("Current amount: " + this.amount);
        System.out.println("Pay by Card. Card number = " + this.cardNumber + " and CVV = " + this.cvv + "\n");

    }

    public void printAmount() {
        System.out.println("Current amount: " + this.amount);
    }

}

public class Q4 {
    public static void main(String[] args) {

        Payment payment1 = new Payment();
        payment1.newPayment(1000);
        payment1.newPayment(300, "123456789X");
        payment1.newPayment(300, "1234 5678 9012 3456", 124);
    }
}
