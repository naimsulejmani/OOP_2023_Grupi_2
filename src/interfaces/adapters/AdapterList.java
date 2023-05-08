package interfaces.adapters;


import java.util.List;

public class AdapterList implements Listable {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public void set(int index, Object item) {

    }

    @Override
    public void remove(Object item) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public List<Object> getAll() {
        return null;
    }
}
