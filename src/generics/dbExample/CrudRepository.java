package generics.dbExample;

import java.util.List;

public interface CrudRepository<T, Tid> {

    //add - create - insert
    //boolean add(T item);
    //T add(T item);
    void add(T item);

    void modify(Tid id, T item);

    void remove(Tid id);

    List<T> findAll();

    T findById(Tid id);

}
