package WIA1002.Assignments.Group.G_Assignment_3;

import java.util.Stack;

/*  
  ---------------------------
  Group 35 - Team Members
  ---------------------------
  Student 1: [Khan Safwan Hasan] – Singly Linked List
  Student 2: [Tanvir Hossain] – Indexed List
  Student 3: [Md Raiyan Takrim] – Doubly Linked List with Cursor
  Student 4: [Saikat Das] – Undo/Redo with Stack
  Student 5: [Nur Husna] – Testing
  Student 6: [Izzah] - Testing
*/

public class ChatManager {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    // ===== Student 1 =====
    static class SinglyLinkedList {

        Node head, tail;

        void addFirst(String msg) {
            Node newNode = new Node(msg);
            newNode.next = head;
            head = newNode;
            if (tail == null)
                tail = head;
        }

        void addLast(String msg) {
            Node newNode = new Node(msg);
            if (tail == null)
                head = tail = newNode;
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        String removeFirst() {
            if (head == null)
                return null;
            else {
                head = head.next;
                if (head == null)
                    tail = null;
            }
            return "Removed successfully";
        }

        void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // ===== Student 2 =====
    static class SinglyLinkedListIndexed extends SinglyLinkedList {

        void addAt(int index, String msg) {
            if (index < 0)
                return;

            if (index == 0) {
                addFirst(msg);
                return;
            }

            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null)
                    return; // Index out of bounds
                current = current.next;
            }

            if (current == null)
                return; // Index out of bounds

            Node newNode = new Node(msg);
            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == null) {
                tail = newNode;
            }
        }

        void removeAt(int index) {
            if (index < 0 || head == null)
                return;

            if (index == 0) {
                removeFirst();
                return;
            }

            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null || current.next == null)
                    return; // Index out of bounds
                current = current.next;
            }

            if (current.next == null)
                return; // Nothing to remove

            current.next = current.next.next;

            if (current.next == null) {
                tail = current;
            }
        }
    }

    // ===== Student 3 =====
    static class DoublyLinkedListWithCursor {
        static class Node {
            String data;
            Node prev, next;

            Node(String data) {
                this.data = data;
            }
        }

        Node head, tail, cursor;

        void insertAtCursor(String msg) {
            Node newNode = new Node(msg);
            if (cursor == null) {
                head = tail = cursor = newNode;
            } else {
                newNode.next = cursor.next;
                newNode.prev = cursor;
                if (cursor.next != null)
                    cursor.next.prev = newNode;
                cursor.next = newNode;
                if (cursor == tail)
                    tail = newNode;
                cursor = newNode;
            }
        }

        void moveLeft() {
            if (cursor != null && cursor.prev != null)
                cursor = cursor.prev;
        }

        void moveRight() {
            if (cursor != null && cursor.next != null)
                cursor = cursor.next;
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print((temp == cursor ? "[" + temp.data + "]" : temp.data) + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // ===== Student 4 =====
    static class UndoRedoManager {
        Stack<String> undo = new Stack<>();
        Stack<String> redo = new Stack<>();

        void perform(String action) {
            undo.push(action);
            redo.clear();
        }

        String undo() {
            if (!undo.isEmpty()) {
                String action = undo.pop();
                redo.push(action);
                return action;
            }
            return "Nothing to undo";
        }

        String redo() {
            if (!redo.empty()) {
                String action = redo.pop();
                undo.push(action);
                return action;
            }
            return "Nothing to redo";
        }

        void printStacks() {
            for (String undoAction : undo) {
                System.out.print(undoAction + " ");
            }
            System.out.println();

            for (String redoAction : redo) {
                System.out.print(redoAction + " ");
            }
            System.out.println();
        }
    }

    // ===== Student 5 & 6 =====
    public static void main(String[] args) {
        // Test SinglyLinkedList
        System.out.println("Testing SinglyLinkedList:");
        SinglyLinkedListIndexed list = new SinglyLinkedListIndexed();
        list.addFirst("Hello");
        list.addLast("How are you?");
        list.removeFirst();
        list.print();

        // Test SinglyLinkedListIndexed
        System.out.println("\nTesting SinglyLinkedListIndexed:");
        list.addAt(1, "I'm fine");
        list.removeAt(0);
        list.print();

        // Test DoublyLinkedListWithCursor
        System.out.println("\nTesting DoublyLinkedListWithCursor:");
        DoublyLinkedListWithCursor history = new DoublyLinkedListWithCursor();
        history.insertAtCursor("One");
        history.insertAtCursor("Two");
        history.insertAtCursor("Three");
        history.print();
        history.moveLeft();
        history.insertAtCursor("Left");
        history.print();
        history.moveRight();
        history.insertAtCursor("Right");
        history.print();

        // Test UndoRedoManager
        System.out.println("\nTesting UndoRedoManager:");
        UndoRedoManager manager = new UndoRedoManager();
        manager.perform("add:Hi");
        manager.perform("remove:Bye");
        System.out.println("Undo: " + manager.undo());
        System.out.println("Redo: " + manager.redo());
        manager.printStacks();
    }

}