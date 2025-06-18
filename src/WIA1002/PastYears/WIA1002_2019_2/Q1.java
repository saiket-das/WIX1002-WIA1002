package WIA1002.PastYears.WIA1002_2019_2;

public class Q1 {

    public static void main(String[] args) {
        MyLinkedList<String> strLL = new MyLinkedList<String>();

        strLL.addFirst("Hello");
        strLL.addFirst("World");

        System.out.println("String Linked List:");
        System.out.println(strLL.toString());
        System.out.println("String Size = " + strLL.getSize());

        MyLinkedList<Integer> intLL = new MyLinkedList<Integer>();
        intLL.addFirst(10);
        intLL.addFirst(20);
        intLL.addFirst(30);
        intLL.addFirst(40);
        intLL.addFirst(50);
        intLL.addFirst(90);
        intLL.addFirst(0);
        System.out.println("\nInteger List:");
        System.out.println(intLL.toString());
        System.out.println("Integer Size = " + intLL.getSize());
    }
}

// Q1 - (a)
class Node<E> {
    E val;
    Node<E> next;

    Node(E val) {
        this.val = val;
        this.next = null;
    }
}

// Q1 - (b)
class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void addFirst(E val) {
        Node<E> newNode = new Node<>(val);
        if (head == null) {
            head = tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E val) {
        if (head == null) {
            addFirst(val);
            return;
        }

        Node<E> newNode = new Node<>(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public E removeFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }

        E returnData = head.val;
        head = head.next;
        return returnData;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node<E> temp = head;
        while (temp != null) {
            sb.append(temp.val);
            if (temp.next != null) {
                sb.append(" >> ");
            }
            temp = temp.next;
        }

        return sb.toString();
    }
}
