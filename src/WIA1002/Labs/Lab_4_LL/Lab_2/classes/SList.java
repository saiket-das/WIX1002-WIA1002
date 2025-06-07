package WIA1002.Labs.Lab_4_LL.Lab_2.classes;

public class SList<E> {
    private SNode<E> head;
    private int size = 0;

    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<E>(e);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        SNode<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        newNode.next = null;
        current.next = newNode;
        size++;
    }

    public E removeInitial() {
        E returnData = head.data;
        head = head.next;
        size--;
        return returnData;
    }

    public boolean contains(E e) {
        SNode<E> current = head;
        while (current != null) {
            if (current.data.equals(e)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int getSize() {
        return size;
    }

    // Rename
    public void rename(E oldName, E newName) {
        SNode<E> current = head;
        while (current != null) {
            if (current.data.equals(oldName)) {
                current.data = newName;
                return;
            }
            current = current.next;
        }
    }

    // Remove
    public void remove(E studentName) {
        SNode<E> current = head;

        if (head.data.equals(studentName)) {
            head = head.next;
            return;
        }

        while (current.next != null) {
            if (current.next.data.equals(studentName)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }

    }

    public void clear() {
        head = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("⚠️ List is empty!");
            return;
        }

        SNode<E> current = head;

        while (current != null) {
            if (current.next == null) {
                System.out.println(current.data + ".");
            } else {
                System.out.print(current.data + ", ");
            }
            current = current.next;
        }
    }
}
