package WIA1002.Labs.Lab_4_LL.Lab_1;

import WIA1002.Labs.Lab_4_LL.Lab_1.classes.MyLinkedList;

public class Q1 {
    public static void main(String[] args) {
        MyLinkedList<Character> characterList = new MyLinkedList<Character>();

        // Add
        characterList.addLast('a');
        characterList.addLast('b');
        characterList.addLast('c');
        characterList.addLast('d');
        characterList.addFirst('z');
        characterList.add(5, 'e');
        characterList.add(25, 'y');
        characterList.print();
        System.out.println("Middle value: " + characterList.getMiddleValue());

        // Remove
        characterList.removeFirst();
        characterList.removeLast();
        characterList.remove(2);
        characterList.print();

        // Reverse
        System.out.print("Reversed: ");
        characterList.reverse();
        characterList.print();

        // Get
        System.out.println("First element: " + characterList.getFirst());
        System.out.println("Last element: " + characterList.getLast());

        // Clear
        characterList.clear();
        characterList.print();
    }
}
