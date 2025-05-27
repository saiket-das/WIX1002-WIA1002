package WIA1002.Tutorials.Tutorial_4;

public class Q1 {
    public static void main(String[] args) {

        // (a)
        Node<Character> head = new Node<>('a');
        Node<Character> tail = new Node<>('z');

        /*
         * (b)
         * head -> ['a', null], tail -> ['z', null]
         */

        // (c)
        head.next = tail; // head -> ['a', next] -> ['z', null]

        // (d)
        Node<Character> firstNode = new Node<>('x');
        firstNode.next = head; // firstNode -> ['x', next] -> ['a', next] -> ['z', null]

        addLast(tail, 'b');
        printLinkedList(firstNode);

    }

    static class Node<E> {
        E element;
        Node<E> next;

        Node(E element) {
            this.element = element;
            this.next = null;
        }

    }

    public static <E> void addLast(Node<E> tail, E element) {
        Node<E> newNode = new Node<>(element);

        tail.next = newNode;
    }

    public static <E> void printLinkedList(Node<E> node) {
        Node<E> currentNode = node;
        while (currentNode != null) {
            System.out.print(currentNode.element + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
