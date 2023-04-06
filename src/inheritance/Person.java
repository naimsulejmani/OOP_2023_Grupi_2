package inheritance;

import associations_relationships.courses.Gender;

import java.time.LocalDate;

public class Person extends Object{
    private String name;
    private String surname;
    private LocalDate birthdate;
    private Gender gender;
    private String nationality;

    public Person(String name, String surname, LocalDate birthdate, Gender gender, String nationality) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.nationality = nationality;
    }

    public Person(String name, String surname, Gender gender) {
        this(name, surname, LocalDate.now(), gender, "K/shqiptar");
    }

    public Person(String name, String surname) {
        this(name, surname, LocalDate.now(), Gender.NOT_SPECIFIED, "K/shqiptar");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", gender=" + gender +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}















