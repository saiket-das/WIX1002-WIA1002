package WIA1002.Tutorials.Tutorial_4_LL.classes;

public class Node<E> {
    E val;
    Node<E> next;

    Node(E val) {
        this.val = val;
        next = null;
    }
}