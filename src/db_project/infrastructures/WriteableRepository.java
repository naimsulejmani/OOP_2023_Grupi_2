package db_project.infrastructures;

public interface WriteableRepository<T, Tid> {
    void add(T model);

    void modify(Tid id, T model);

    void remove(Tid id);
}
