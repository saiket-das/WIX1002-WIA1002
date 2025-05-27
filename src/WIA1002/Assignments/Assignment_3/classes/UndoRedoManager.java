/* Group 35 - Saiket Das (22117847) */

package WIA1002.Assignments.Assignment_3.classes;

import java.util.Stack;

public class UndoRedoManager {
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

    public static void main(String[] args) {
        UndoRedoManager manager = new UndoRedoManager();
        manager.perform("add:Hi");
        manager.perform("remove:Bye");
        manager.perform("add:NewMessage");
        manager.printStacks();
        System.out.println("Undo: " + manager.undo());
        System.out.println("Undo: " + manager.undo());
        System.out.println("Undo: " + manager.undo());
        System.out.println("Undo: " + manager.undo());
        manager.printStacks();
        System.out.println("Redo: " + manager.redo());
        manager.printStacks();
    }

}
