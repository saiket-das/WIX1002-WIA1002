package WIA1002.Labs.Lab_4_LL.Lab_2.classes;

public class DNode<E> {
    E data;
    DNode<E> prev;
    DNode<E> next;

    DNode(E data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
