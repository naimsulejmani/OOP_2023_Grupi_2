package interfaces.adapters;

import java.util.List;

public interface Listable {
    public abstract int size();

    boolean isEmpty();

    void add(Object item);

    void set(int index, Object item);

    void remove(Object item);

    void remove(int index);

    Object get(int index);

    List<Object> getAll();
}
