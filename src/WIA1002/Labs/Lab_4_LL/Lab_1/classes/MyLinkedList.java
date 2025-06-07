package WIA1002.Labs.Lab_4_LL.Lab_1.classes;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    // Question 3: (a) - addFirst()
    public void addFirst(E e) {
        Node<E> newNode = new Node<E>(e);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    // Question 3: (b) - addLast()
    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
            return;
        }

        Node<E> newNode = new Node<E>(e);
        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        tail = newNode;
        size++;
    }

    // Question 3: (c) - add()
    public void add(int index, E e) {
        if (index <= 0) {
            addFirst(e);
            return;
        }
        if (index >= size) {
            addLast(e);
            return;
        }

        Node<E> newNode = new Node<E>(e);
        Node<E> current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }

        size++;
    }

    // Question 3: (d) - removeFirst()
    public E removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        E reuturData = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return reuturData;
    }

    // Question 3: (e) - removeLast()
    public E removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (head == tail) {
            E reuturData = head.data;
            head = tail = null;
            size--;
            return reuturData;
        }

        Node<E> current = head;
        while (current.next != tail) {
            current = current.next;
        }

        E reuturData = tail.data;
        current.next = null;
        tail = current;
        size--;

        return reuturData;
    }

    // Question 3: (f) - remove()
    public E remove(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (index <= 0) {
            return removeFirst();
        }

        if (index >= size - 1) {
            return removeLast();
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        E returnData = current.next.data;
        current.next = current.next.next;

        if (current.next == null) {
            tail = current;
        }
        size--;

        return returnData;
    }

    // Question 4: (a) - contains()
    public boolean contains(E e) {
        if (head == null) {
            System.out.println("List is empty");
            return false;
        }

        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(e)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // Question 4: (b) - get()
    public E get(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        if (index <= 0) {
            return head.data;
        }

        if (index >= size - 1) {
            return tail.data;
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;

    }

    // Question 4: (c) - getFirst()
    public E getFirst() {
        return head.data;
    }

    // Question 4: (d) - getLast()
    public E getLast() {
        return tail.data;
    }

    // Question 4: (e) - clear()
    public void clear() {
        head = tail = null;
    }

    public E getMiddleValue() {
        int middleIdx = size / 2;

        Node<E> current = head;
        for (int i = 0; i < middleIdx; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Question 4: (f) - print()
    public void print() {
        if (head == null || tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node<E> current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.data);
            } else {
                System.out.print(current.data + " => ");
            }
            current = current.next;
        }
    }

    // Question 4: (f) - reverse()
    public void reverse() {

        if (head == null || tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node<E> prev = null;
        Node<E> next = null;

        Node<E> current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
