package WIA1002.Labs.Lab_5_Stack.classes;

import java.util.*;

public class MyStack<E> {
    private ArrayList<E> stackList;

    public MyStack() {
        stackList = new ArrayList<E>();
    }

    public void push(E e) {
        stackList.add(e);
    }

    public E pop() {
        return stackList.remove(stackList.size() - 1);
    }

    public int getSize() {
        return stackList.size();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public boolean search(E e) {
        for (E element : stackList) {
            if (element.equals(e)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (E element : stackList) {
            stringBuilder.append(element.toString() + " ");
        }

        return stringBuilder.toString().trim();
    }
}
