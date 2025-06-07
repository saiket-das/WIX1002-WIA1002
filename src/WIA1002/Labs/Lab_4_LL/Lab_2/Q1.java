package WIA1002.Labs.Lab_4_LL.Lab_2;

import WIA1002.Labs.Lab_4_LL.Lab_2.classes.SList;

public class Q1 {
    public static void main(String[] agrs) {
        SList<String> sList = new SList<String>();

        // Append
        sList.appendEnd("Linked List");
        sList.appendEnd("is");
        sList.appendEnd("easy");
        sList.display();

        // Remove first
        sList.removeInitial();
        sList.removeInitial();
        sList.display();

        // Clear
        sList.clear();
        sList.display();

    }
}
