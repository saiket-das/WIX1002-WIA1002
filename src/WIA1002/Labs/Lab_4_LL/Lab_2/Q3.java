package WIA1002.Labs.Lab_4_LL.Lab_2;

import WIA1002.Labs.Lab_4_LL.Lab_2.Classes.DoublyLinkedList;

public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<Integer>();

        // Add
        intList.addFirst(1);
        intList.addLast(100);
        intList.addLast(10);
        intList.addLast(20);
        // intList.add(10, 1);
        // intList.add(2, 2);

        intList.printForward();

        // Remove
        System.out.println("Removed: " + intList.remove(2));

        // Print
        System.out.println();
        intList.printForward();
        intList.printBackward();

        System.out.println("Removed: " + intList.remove(2));

        // Print
        System.out.println();
        intList.printForward();
        intList.printBackward();

    }
}
