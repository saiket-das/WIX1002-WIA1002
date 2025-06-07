package WIA1002.Tutorials.Tutorial_4_LL.classes;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    // addLast() – value of element, c
    public void addLast(E val) {
        Node<E> newNode = new Node<E>(val);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // add(int index, E e) – value of element, d
    public void add(E val, int index) {
        Node<E> newNode = new Node<E>(val);
        if (index == 0 || head == null) {
            newNode.next = head;
            head = newNode;

            if (tail == null)
                tail = head;
            size++;
            return;
        }

        Node<E> current = head;
        int i = 0;
        while (current.next != null && i < index - 1) {
            current = current.next;
            i++;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
        size++;
    }

    // removeFirst()
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    // removeLast()
    public void removeLast() {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }

        // Case 1
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }

        Node<E> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
        size--;
    }

    // remove(int index) – remove at index 1
    public void remove(int index) {
        if (head == null) {
            System.out.println("List is already empty.");
            return;
        }

        if (index <= 0) {
            removeFirst();
            return;
        }

        if (index >= size - 1) {
            removeLast();
            return;
        }

        Node<E> current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }

        current.next = current.next.next;
        size--;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder display = new StringBuilder();

        Node<E> current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.val);
            } else {
                System.out.print(current.val + " >> ");
            }
            current = current.next;
        }

        return display.toString();
    }
}
