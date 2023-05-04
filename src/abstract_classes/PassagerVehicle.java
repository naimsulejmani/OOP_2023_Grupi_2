package abstract_classes;

public abstract class PassagerVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("BRBRBRBRBBRBRB HEN HEN");
    }

    public abstract void addPassager();
    public abstract void unloadPassagers();
}
