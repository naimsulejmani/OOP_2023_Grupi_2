package associations_relationships;

import java.time.LocalDate;

public class Person {
    private Brain brain;
    private LocalDate birthdate;

    public Person() {
        brain = new Brain();
        birthdate = LocalDate.now();
    }


    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        if (brain != null)
            this.brain = brain;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        if (birthdate != null)
            this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "brain=" + brain +
                ", birthdate=" + birthdate +
                '}';
    }
}
