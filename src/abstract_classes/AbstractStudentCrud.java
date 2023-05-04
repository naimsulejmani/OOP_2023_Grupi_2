package abstract_classes;

public abstract  class AbstractStudentCrud {
    public abstract void create(String name);

    public abstract String read(int id);

    public abstract void update(int id, String name);

    public abstract void delete(int id);
}






