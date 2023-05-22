package db_project.infrastructures;

public interface CrudRepository<T, Tid>
        extends ReadableRepository<T, Tid>, WriteableRepository<T, Tid> {
}
