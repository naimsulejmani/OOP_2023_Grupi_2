package inheritance.summary;

import java.util.ArrayList;

public class WrongStack<T> extends ArrayList<T> {

    public void push(T data) {
        this.add(data);
    }

    public T pop() {
        return this.remove(this.size() - 1);
    }
}
