package WIX1002.Tutorials.Tutorial_8;

class Connection {
    private static int totalConnections = 0;

    Connection() {
        totalConnections++;
        System.out.println("New connection established. (" + totalConnections + ")");
    }

    static void disconnect() {
        if (totalConnections > 0) {
            totalConnections--;
            System.out.println("Disconected.");
        } else {
            System.out.println("No connection available.");
        }
    }

    static void display() {
        System.out.println("Total connection: " + totalConnections);

    }
}

public class Q5 {
    public static void main(String[] args) {
        new Connection();
        new Connection();
        new Connection();
        Connection.disconnect();
        Connection.display();

        new Connection();
        new Connection();
        Connection.disconnect();

        Connection.display();
    }
}
