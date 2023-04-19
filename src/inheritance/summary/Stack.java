package inheritance.summary;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public void push(T data) {
        elements.add(data);
    }

    public T pop() {
        return elements.remove(size() - 1);
    }

    public T peek() {
        return elements.get(size() - 1);
    }
}
















