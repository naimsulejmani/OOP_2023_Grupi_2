package db_project.infrastructures;

import java.util.List;

public interface ReadableRepository<T, Tid>  extends Convertable<T> {
    T findById(Tid id);

    List<T> findAll();
}
