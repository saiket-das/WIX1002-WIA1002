package WIA1002.Year2025.Solutions;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        ques_a();
        ques_b();
    }

    // ------ Part A ------
    static void ques_a() {
        // Example: L1 = 1 -> 3 -> 5, L2 = 2 -> 4 -> 6
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        System.out.print("L1: ");
        printList(l1);
        System.out.print("L2: ");
        printList(l2);

        ListNode l3 = mergeSortedLists(l1, l2);

        System.out.print("Merged L3: ");
        printList(l3);
        System.out.println();
    }

    // ------ Part B ------
    static void ques_b() {
        Scanner input = new Scanner(System.in);

        DoublyLinkedList db = new DoublyLinkedList();

        for (int i = 0; i < 3; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            String str = input.nextLine();
            db.append(str);
            db.print();
            System.out.println(str + " is palindrome: " + db.isPalindrome());
            db.clear();
            db.print();
        }

        input.close();
    }

    // ------ Part A ------
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Merge two sorted singly linked lists in-place
    static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // ------ Part B ------
    static class DNode {
        char data;
        DNode next;
        DNode prev;

        DNode(char data) {
            this.data = data;
        }
    }

    static class DoublyLinkedList {
        DNode head;
        DNode tail;
        int size = 0;

        void append(String data) {
            for (char ch : data.toCharArray()) {
                appendChar(ch);
            }
        }

        void appendChar(char ch) {
            DNode newNode = new DNode(ch);

            if (head == null) {
                head = tail = newNode;
                size++;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }

        void print() {
            DNode temp = head;
            if (temp == null) {
                System.out.println("List is empty!\n");
                return;
            }
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
            System.out.println();
        }

        void clear() {
            head = tail = null;
            size = 0;
        }

        boolean isPalindrome() {
            DNode left = head;
            DNode right = tail;

            int i = 0, j = size;
            while (i <= j && left != null && right != null) {
                if (Character.toLowerCase(left.data) != Character.toLowerCase(right.data)) {
                    return false;
                }
                i++;
                j--;
                left = left.next;
                right = right.prev;
            }

            return true;
        }
    }
}
