package abstract_classes;

public abstract class MyClass {
    public static final int NUMRI_PARE = 1;
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public MyClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void test();
}
