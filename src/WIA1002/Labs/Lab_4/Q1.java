package WIA1002.Labs.Lab_4;

public class Q1 {
    public static void main(String[] args) {
        MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();

        intLinkedList.addFirst(100);
        intLinkedList.addFirst(99);
        intLinkedList.addFirst(98);
        intLinkedList.addLast(101);
        intLinkedList.add(4, 200);
        intLinkedList.add(4, 199);

        // intLinkedList.removeFirst();
        // intLinkedList.removeLast();
        // intLinkedList.remove(4);

        intLinkedList.printLinkedList();

        System.out.println("\nQ4:");
        printYesNo(intLinkedList.contains(199));
        System.out.println("4 Index element is: " + intLinkedList.get(4));
        System.out.println("5 Index element is: " + intLinkedList.get(5));
        System.out.println("6 Index element is: " + intLinkedList.get(6));
        System.out.println(intLinkedList.getFirst());
        System.out.println(intLinkedList.getLast());
    }

    // Q1
    static class Node<E> {
        E element;
        Node<E> next;

        Node(E element) {
            this.element = element;
            this.next = null;
        }
    }

    // Q2
    static class MyLinkedList<E> {
        Node<E> head;
        Node<E> tail;

        MyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        // Q3 (a) - Add element at first
        public void addFirst(E element) {
            Node<E> newNode = new Node<E>(element);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        // Q3 (b) - Add element at last
        public void addLast(E element) {
            Node<E> newNode = new Node<E>(element);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Q3 (c) - Add element at given index
        public void add(int index, E element) {
            if (index < 0) {
                System.out.println("Index cannot be negative.");
                return;
            }

            Node<E> newNode = new Node<E>(element);

            // Add at the beginning
            if (index == 0) {
                newNode.next = head;
                head = newNode;

                if (tail == null) {
                    tail = newNode;
                }
                return;
            }

            // Traverse to the node just before the given index
            Node<E> current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }

            // If index is out of bounds
            if (current == null) {
                System.err.println("Index out of bounds.");
                return;
            }

            // Insert the new node
            newNode.next = current.next;
            current.next = newNode;

            // Update tail if inserted at the end
            if (newNode.next == null) {
                tail = newNode;
            }
        }

        // Q3 (d) - Remove first element
        public void removeFirst() {
            if (head == null) {
                System.out.println("List is empty. Nothing to remove.");
                return;
            }

            head = head.next;
            if (head == null) {
                tail = null;
            }
        }

        // Q3 (e) - Remove first element
        public void removeLast() {
            if (head == null) {
                System.out.println("List is empty. Nothing to remove.");
                return;
            }

            // If only one element exists
            if (head.next == null) {
                head = null;
                tail = null;
                return;
            }

            // Traverse to the second-last node
            Node<E> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            tail = current.next;

        }

        // Q3 (f) - Remove element from given index
        public void remove(int index) {
            if (index < 0) {
                System.out.println("Index cannot be negative.");
                return;
            }

            if (head == null) {
                System.out.println("List is empty. Nothing to remove");
            }

            if (index == 0) {
                head = head.next;

                if (head == null) {
                    tail = null;
                }
                return;
            }

            // Traverse to the node just before the given index
            Node<E> current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }

            // If index is out of bounds
            if (current == null || current.next == null) {
                System.err.println("Index out of bounds.");
                return;
            }

            current.next = current.next.next;

            if (current.next == null) {
                tail = current;
            }
        }

        // Q4 - Contains element
        public boolean contains(E element) {
            Node<E> current = head;

            while (current != null) {
                if (current.element.equals(element)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // Q4 - Get given index's element
        public E get(int index) {
            if (index < 0) {
                throw new Error("Index cannot be negative.");
            }

            if (index == 0) {
                return head.element;
            }

            Node<E> current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index) {
                current = current.next;
                currentIndex++;
            }

            if (current == null) {
                throw new Error("Index out of bounds");
            }

            return current.element;
        }

        // Q4 - Get fist element
        public E getFirst() {
            if (head == null) {
                throw new Error("List is empty.");
            }
            return head.element;
        }

        // Q4 - Get last element
        public E getLast() {
            if (head == null) {
                throw new Error("List is empty.");
            }
            return tail.element;
        }

        public void printLinkedList() {
            Node<E> current = head;
            System.out.println("Print all elements:");
            while (current != null) {
                System.err.print(current.element + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void printYesNo(boolean value) {
        if (value == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
