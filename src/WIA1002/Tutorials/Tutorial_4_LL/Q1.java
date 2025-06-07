package WIA1002.Tutorials.Tutorial_4_LL;

import WIA1002.Tutorials.Tutorial_4_LL.classes.MyLinkedList;

public class Q1 {

    public static void main(String[] args) {
        MyLinkedList<Character> charcList = new MyLinkedList<Character>();

        charcList.addLast('a');
        charcList.add('b', 1);
        charcList.add('c', 2);
        charcList.add('d', 3);
        charcList.add('e', 4);
        charcList.addLast('z');
        System.err.println(charcList.getSize());
        System.err.println(charcList);

        charcList.removeFirst();
        charcList.removeLast();
        charcList.removeLast();
        charcList.remove(1);
        System.err.println(charcList.getSize());
        System.err.println(charcList);

    }
}
