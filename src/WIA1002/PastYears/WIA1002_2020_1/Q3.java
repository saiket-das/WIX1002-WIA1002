package WIA1002.PastYears.WIA1002_2020_1;

/*  Write a program using linked list. */

public class Q3 {
    public static void main(String[] args) {

    }
}

class Node<E> {
    E val;
    Node<E> next;

    Node(E val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    MyLinkedList(E e) {
        addFirst(e);
    }

    MyLinkedList(E[] elements) {
        for (E e : elements) {
            addLast(e);
        }
    }

    // Add First
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add Last
    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
            return;
        }

        Node<E> newNode = new Node<>(e);

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        tail = newNode;
        size++;
    }

    // Remove
    public E removeFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }

        if (head == tail) {
            E returnData = head.val;
            head = tail = null;
            size--;
            return returnData;
        }
        E returnData = head.val;
        head = head.next;
        return returnData;
    }

    public E removeLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }

        if (head == tail) {
            E returnData = head.val;
            head = tail = null;
            size--;
            return returnData;
        }

        Node<E> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        E returnData = tail.val;
        temp.next = null;
        return returnData;
    }

    // Remove specific index
    public E remove(int index) {
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }

        if (head == tail) {
            removeFirst();
        }
        if (index <= 0) {
            removeFirst();
        }
        if (index >= size) {
            removeLast();
        }

        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        E returnData = temp.next.val;
        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }
        size--;
        return returnData;
    }

    // Is Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get
    public int getSize() {
        return size;
    }
}
