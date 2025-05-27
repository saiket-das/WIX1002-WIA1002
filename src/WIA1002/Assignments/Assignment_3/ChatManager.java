package WIA1002.Assignments.Assignment_3;
/*
 * 
 * import java.util.Stack;
 * 
 * // Group Tutorial [Tutorial Number]
 * 
 * // Group Members:
 * // Student 1: [Khan Safwan Hasan] – Singly Linked List
 * // Student 2: [Tanvir Hossain] – Indexed List
 * // Student 3: [Md Raiyan Takrim] – Doubly Linked List with Cursor
 * // Student 4: [Saikat Das] – Undo/Redo with Stack
 * // Student 5: [Nur Husna] – Testing
 * // Student 6: [Izzah] - Testing
 * 
 * public class ChatManager {
 * 
 * public static void main(String[] args) {
 * System.out.println("===== Testing SinglyLinkedList =====");
 * SinglyLinkedList list1 = new SinglyLinkedList();
 * list1.addFirst("Hello");
 * list1.addLast("How are you?");
 * list1.print();
 * 
 * String removed = list1.removeFirst();
 * System.out.println("Removed: " + removed);
 * list1.print();
 * 
 * System.out.println("\n===== Testing SinglyLinkedListIndexed =====");
 * SinglyLinkedListIndexed list2 = new SinglyLinkedListIndexed();
 * list2.addAt(1, "Hello");
 * list2.removeAt(1);
 * list2.print();
 * 
 * list2.addAt(1, "I'm fine");
 * list2.print();
 * 
 * removed = list2.removeAt(0);
 * System.out.println("Removed: " + removed);
 * list2.print();
 * 
 * System.out.println("\n===== Testing DoublyLinkedListWithCursor =====");
 * DoublyLinkedListWithCursor history = new DoublyLinkedListWithCursor();
 * history.insertAtCursor("Hi");
 * history.print();
 * 
 * history.insertAtCursor("Bye");
 * history.print();
 * 
 * history.moveRight();
 * history.print();
 * 
 * history.moveLeft();
 * history.print();
 * 
 * history.insertAtCursor("Wait");
 * history.print();
 * 
 * System.out.println("\n===== Testing UndoRedoManager =====");
 * UndoRedoManager manager = new UndoRedoManager();
 * manager.perform("add:Hi");
 * manager.perform("add:Bye");
 * manager.perform("remove:Hi");
 * 
 * manager.printStacks();
 * 
 * System.out.println("Undo: " + manager.undo());
 * manager.printStacks();
 * 
 * System.out.println("Redo: " + manager.redo());
 * manager.printStacks();
 * 
 * System.out.println("\n===== Integrated Test =====");
 * SinglyLinkedListIndexed messageList = new SinglyLinkedListIndexed();
 * UndoRedoManager actionManager = new UndoRedoManager();
 * 
 * messageList.addLast(" message");
 * actionManager.perform("add:First message");
 * 
 * messageList.addLast("Second message");
 * actionManager.perform("add:Second message");
 * 
 * messageList.print();
 * 
 * String lastAction = actionManager.undo();
 * System.out.println("Undoing: " + lastAction);
 * 
 * if (lastAction != null && lastAction.startsWith("add:")) {
 * messageList.removeAt(1);
 * }
 * 
 * messageList.print();
 * 
 * lastAction = actionManager.redo();
 * System.out.println("Redoing: " + lastAction);
 * 
 * if (lastAction != null && lastAction.startsWith("add:")) {
 * messageList.addLast("Second message");
 * }
 * 
 * messageList.print();
 * }
 * 
 * static class Node {
 * String data;
 * Node next;
 * 
 * Node(String data) {
 * this.data = data;
 * }
 * }
 * 
 * // Student 1 -
 * static class SinglyLinkedList {
 * 
 * Node head, tail;
 * 
 * void addFirst(String msg) {
 * Node newNode = new Node(msg);
 * newNode.next = head;
 * head = newNode;
 * if (tail == null) {
 * tail = head;
 * }
 * }
 * 
 * void addLast(String msg) {
 * Node newNode = new Node(msg);
 * if (tail == null)
 * head = tail = newNode;
 * else {
 * tail.next = newNode;
 * tail = newNode;
 * }
 * }
 * 
 * String removeFirst() {
 * if (head == null)
 * return null;
 * else {
 * head = head.next;
 * if (head == null)
 * tail = null;
 * }
 * return "Removed successfully";
 * }
 * 
 * void print() {
 * Node current = head;
 * while (current != null) {
 * System.out.print(current.data + " -> ");
 * current = current.next;
 * }
 * System.out.println("null");
 * }
 * }
 * 
 * // Student 2 -
 * class SinglyLinkedListIndexed {
 * static class Node {
 * String data;
 * Node next;
 * 
 * Node(String data) {
 * this.data = data;
 * }
 * }
 * 
 * Node head;
 * 
 * void addAt(int index, String msg) {
 * Node newNode = new Node(msg);
 * if (index == 0) {
 * newNode.next = head;
 * head = newNode;
 * return;
 * }
 * 
 * Node temp = head;
 * for (int i = 0; temp != null && i < index - 1; i++) {
 * temp = temp.next;
 * }
 * 
 * if (temp != null) {
 * newNode.next = temp.next;
 * temp.next = newNode;
 * }
 * }
 * 
 * String removeAt(int index) {
 * if (head == null)
 * return "No message Found";
 * 
 * if (index == 0) {
 * String removedMessage = head.data;
 * head = head.next;
 * return removedMessage;
 * }
 * 
 * Node temp = head;
 * for (int i = 0; temp != null && i < index - 1; i++) {
 * temp = temp.next;
 * }
 * 
 * if (temp != null && temp.next != null) {
 * temp.next = temp.next.next;
 * }
 * 
 * return "";
 * }
 * 
 * void print() {
 * Node temp = head;
 * while (temp != null) {
 * System.out.print(temp.data + " -> ");
 * temp = temp.next;
 * }
 * System.out.println("null");
 * }
 * }
 * 
 * // Student 3 -
 * class DoublyLinkedListWithCursor {
 * static class Node {
 * String data;
 * Node prev, next;
 * 
 * Node(String data) {
 * this.data = data;
 * }
 * }
 * 
 * Node head, tail, cursor;
 * 
 * void insertAtCursor(String msg) {
 * Node newNode = new Node(msg);
 * if (cursor == null) {
 * head = tail = cursor = newNode;
 * } else {
 * newNode.next = cursor.next;
 * newNode.prev = cursor;
 * if (cursor.next != null)
 * cursor.next.prev = newNode;
 * cursor.next = newNode;
 * if (cursor == tail)
 * tail = newNode;
 * cursor = newNode;
 * }
 * }
 * 
 * void moveLeft() {
 * if (cursor != null && cursor.prev != null)
 * cursor = cursor.prev;
 * }
 * 
 * void moveRight() {
 * if (cursor != null && cursor.next != null)
 * cursor = cursor.next;
 * }
 * 
 * void print() {
 * Node temp = head;
 * while (temp != null) {
 * System.out.print((temp == cursor ? "[" + temp.data + "]" : temp.data) +
 * " <-> ");
 * temp = temp.next;
 * }
 * System.out.println("null");
 * }
 * }
 * 
 * // Student 4 -
 * static class UndoRedoManager {
 * Stack<String> undo = new Stack<>();
 * Stack<String> redo = new Stack<>();
 * 
 * void perform(String action) {
 * undo.push(action);
 * redo.clear();
 * }
 * 
 * String undo() {
 * if (!undo.isEmpty()) {
 * String action = undo.pop();
 * redo.push(action);
 * return action;
 * }
 * return "Nothing to undo";
 * }
 * 
 * String redo() {
 * if (!redo.empty()) {
 * String action = redo.pop();
 * undo.push(action);
 * return action;
 * }
 * return "Nothing to redo";
 * }
 * 
 * void printStacks() {
 * for (String undoAction : undo) {
 * System.out.print(undoAction + " ");
 * }
 * System.out.println();
 * 
 * for (String redoAction : redo) {
 * System.out.print(redoAction + " ");
 * }
 * System.out.println();
 * }
 * }
 * 
 * }
 */

import java.util.Stack;

// Group Tutorial [Tutorial Number]

// Group Members:
// Student 1: [Khan Safwan Hasan] – Singly Linked List
// Student 2: [Tanvir Hossain] – Indexed List
// Student 3: [Md Raiyan Takrim] – Doubly Linked List with Cursor
// Student 4: [Saikat Das] – Undo/Redo with Stack
// Student 5: [Nur Husna] – Testing
// Student 6: [Izzah] - Testing

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

    // Student 3
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

    // Student 4
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