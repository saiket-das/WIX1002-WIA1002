package WIA1002.Labs.Lab_4_LL.Lab_1.classes;

public class Node<E> {
    E data;
    Node<E> next;

    Node(E data) {
        this.data = data;
        this.next = null;
    }
}
