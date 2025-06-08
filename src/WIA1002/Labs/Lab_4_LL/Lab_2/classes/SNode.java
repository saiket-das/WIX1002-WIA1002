package WIA1002.Labs.Lab_4_LL.Lab_2.Classes;

public class SNode<E> {
    E data;
    SNode<E> next;

    SNode(E data) {
        this.data = data;
        this.next = null;
    }
}
