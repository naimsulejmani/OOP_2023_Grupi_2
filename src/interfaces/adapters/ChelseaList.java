package interfaces.adapters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChelseaList extends AdapterList {
    private ArrayList<Object> list = new ArrayList<>();

    @Override
    public void add(Object item) {
        list.add(item);
    }

    @Override
    public List<Object> getAll() {
        return list;
    }
}
