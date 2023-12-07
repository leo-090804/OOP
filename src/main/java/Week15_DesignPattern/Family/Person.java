package Week15_DesignPattern.Family;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private List<Person> children;
    private Person spouse;

    public Person(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.children = new ArrayList<>();
        this.spouse = null;
    }

    public void marry(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Person> getChildren() {
        return children;
    }

    public Person getSpouse() {
        return spouse;
    }

    public boolean isMarried() {
        return spouse != null;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }
}
