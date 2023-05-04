package abstract_classes;

public class Derived extends Base {

    public Derived() {
//        super();
        System.out.println("Derived Constructor called!");
    }

    @Override
    public void fun() {
        System.out.println("Implemented fun() method on Derived class!");
    }
}
