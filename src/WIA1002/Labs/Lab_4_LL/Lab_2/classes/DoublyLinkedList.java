package WIA1002.Labs.Lab_4_LL.Lab_2.Classes;

public class DoublyLinkedList<E> {
    DNode<E> head;
    DNode<E> tail;
    int size = 0;

    public void addFirst(E e) {
        DNode<E> newNode = new DNode<E>(e);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
            return;
        }

        DNode<E> newNode = new DNode<E>(e);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void add(E e, int index) {
        if (index <= 0) {
            addFirst(e);
            return;
        }

        if (index >= size) {
            addLast(e);
            return;
        }

        DNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // 1, 2, [5], 4
        DNode<E> newNode = new DNode<E>(e);
        newNode.prev = current.prev;
        newNode.next = current;

        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        } else {
            head = newNode;
        }

        current.prev = newNode;
        size++;
    }

    public E remove(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (index <= 0) {
            E returnData = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // List is now empty
            }
            size--;
            return returnData;
        }

        if (index >= size - 1) {
            E returnData = tail.data;
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; // List is now empty
            }
            size--;
            return returnData;
        }

        DNode<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        E returnData = current.next.data;
        current.next = current.next.next;

        if (current.next != null) {
            current.next.prev = current;
        }
        size--;
        return returnData;
    }

    public void printForward() {
        System.out.println("Iterating forward: ");
        DNode<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() {
        System.out.println("Iterating backward: ");
        DNode<E> current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
